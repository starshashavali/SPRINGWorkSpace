package com.org.tcs;

public class PetrolEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Petrol Engine  ...");
		return 1;
	}

}
