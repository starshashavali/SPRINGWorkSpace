package com.org.dao;

import com.org.domain.Employee;

public interface UserDao {
	
	    public void saveEmployee(Employee employee);
	    public Employee getEmployeeById(Integer id);
	    public void updateEmployee(Employee employee);
	    public void deleteEmployee(int id);
	}
