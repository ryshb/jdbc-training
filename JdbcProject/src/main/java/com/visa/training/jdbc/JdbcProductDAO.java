package com.visa.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcProductDAO {

	public Product findById(int id) {
		Product p = null;

		try (Connection c = JdbcUtil.getConnection()) {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from product where product_id=" + id);

			if (rs.next()) {
				p = mapRow(rs);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	private Product mapRow(ResultSet rs) throws SQLException {
		Product p;
		p = new Product();
		p.setId(rs.getInt(1));
		p.setName(rs.getString(2));
		p.setPrice(rs.getFloat(3));
		p.setQoh(rs.getInt(4));
		return p;
	}

	public List<Product> findAll() {
		List<Product> all = new ArrayList<Product>();

		try (Connection c = JdbcUtil.getConnection()) {

			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from product");

			while (rs.next()) {
				Product p = mapRow(rs);
				all.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}

	public Product save(Product toBeSaved) {

		try (Connection c = JdbcUtil.getConnection()) {

			PreparedStatement pstmt = c.prepareStatement(
					"insert into product(product_name,product_price,product_qoh) values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, toBeSaved.getName());
			pstmt.setFloat(2, toBeSaved.getPrice());
			pstmt.setInt(3, toBeSaved.getQoh());
			pstmt.executeUpdate();
			// for auto generated keys
			ResultSet keys = pstmt.getGeneratedKeys();
			keys.next();
			toBeSaved.setId(keys.getInt(1));
		} catch (Exception e) {
			e.printStackTrace();

		}
		return toBeSaved;
	}

}
