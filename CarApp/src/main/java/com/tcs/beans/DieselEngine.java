package com.tcs.beans;

public class DieselEngine implements IEngine {

	@Override
	public Integer start() {
		System.out.println("DieselEngine ...");
		return 1;
	}

}
