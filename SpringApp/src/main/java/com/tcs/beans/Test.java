package com.tcs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//configuration file input
	ApplicationContext ctxt= new ClassPathXmlApplicationContext("Beans.xml");
	Paymentservice service = ctxt.getBean(Paymentservice.class);
	service.doBilling(299.0);
		
	}

}
