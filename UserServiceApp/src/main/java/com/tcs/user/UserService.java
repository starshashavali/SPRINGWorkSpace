package com.tcs.user;

public class UserService {

	private IUserDao userDao;

	public UserService() {
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public UserService(IUserDao userDao) {
		this.userDao = userDao;
	}

	public void printName(Integer id) {
		 userDao.findById(id);
		System.out.println(" name is printed...");
	}

}
