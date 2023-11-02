package com.org.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctxt=
				new  AnnotationConfigApplicationContext(AppConfig.class);
		ReportService serrvice = ctxt.getBean(ReportService.class);
		serrvice.generateReport();
	}

}
