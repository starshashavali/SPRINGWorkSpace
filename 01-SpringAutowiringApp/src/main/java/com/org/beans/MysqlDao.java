package com.org.beans;

import org.springframework.stereotype.Component;

@Component
public class MysqlDao implements ReportDao {

	public void getReport() {
		System.out.println("Mysql dao...");
	}

}
