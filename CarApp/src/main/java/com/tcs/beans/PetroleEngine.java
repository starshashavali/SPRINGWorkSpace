package com.tcs.beans;

public class PetroleEngine  implements IEngine{

	@Override
	public Integer start() {
		System.out.println("Petrole Engine");
		return 1;
	}

}
