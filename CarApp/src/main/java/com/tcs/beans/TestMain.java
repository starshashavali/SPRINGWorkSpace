package com.tcs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
	ApplicationContext ctxt=
			new ClassPathXmlApplicationContext("file:///D:/SpringLearning/CarApp/src/main/java/com/tcs/beans/Beans.xml");
	Car car = ctxt.getBean(Car.class);
	car.drive();
	}
}
