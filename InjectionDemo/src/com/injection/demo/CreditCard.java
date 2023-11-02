package com.injection.demo;

public class CreditCard implements IEngine {

	@Override
	public void doProcess() {
		System.out.println("CreditCard bill payment...");
	}

}
