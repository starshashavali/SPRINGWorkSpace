package com.org.tcs;

public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Diesel Engine...");
		return 1;
	}

}
