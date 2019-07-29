package com.visa.prj.entity;
/**
 * this is a class to represent  account business data
 * it allows to credit and debit ammount 
 * @author root
 * @version 1.0
 *
 */

public class Account {
	private double balance;//state of object->instance variables
	
	private static int count;
	
	public Account(){
	   count++;
	}
	
	/**
	 * method to credit ammount into account
	 * @param amt ammount to be credited
	 */
	//instance method, called through an object
	public void deposit(double amt) {// pv deposit(Account this, double amt)
		this.balance+=amt;                  // this.balance+=amt
	}
	
	/**
	 * method returns the current balance in account
	 * @return the current balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	public static int getCount() {
		return count;
	}
}
