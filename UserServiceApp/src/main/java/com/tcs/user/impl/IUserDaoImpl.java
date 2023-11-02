package com.tcs.user.impl;

import com.tcs.user.IUserDao;

public class IUserDaoImpl implements IUserDao {

	@Override
	public String findById(Integer id) {
		System.out.println("1,Ramaa");
		return "suceessfully fetched...";
	}

}
