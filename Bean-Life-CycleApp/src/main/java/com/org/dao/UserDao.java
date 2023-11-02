package com.org.dao;

public class UserDao {

	public void init() {
		System.out.println("connect database ");
	}
	
	public void service() {
		System.out.println("Actual method...");
	}
	
	public void destroy() {
		System.out.println("After database...");
	}

}
