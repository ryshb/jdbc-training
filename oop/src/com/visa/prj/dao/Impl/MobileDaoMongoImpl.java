package com.visa.prj.dao.Impl;

import com.visa.prj.dao.MobileDao;
import com.visa.prj.entity.Mobile;

public class MobileDaoMongoImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("stored in MongoDb !!");

	}

}
