package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.UserDao;
import com.org.domain.Employee;

@RestController
public class EmpRestController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmp(@RequestBody Employee emp){
		userDao.saveEmployee(emp);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

}
