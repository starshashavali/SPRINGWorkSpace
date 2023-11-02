package com.injection.demo;

public class DebitCard implements IEngine {

	@Override
	public void doProcess() {
		System.out.println("Debit card bill payment...");
	}

}
