package com.org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.config.AppConfig;

public class AppTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctxt=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
