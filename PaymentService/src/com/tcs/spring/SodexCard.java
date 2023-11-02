package com.tcs.spring;

public class SodexCard implements IPayment {

	@Override
	public boolean billProcess() {

		System.out.println("Sodex Card food ");
		return true;
	}

}
