package com.org.tcs;

public class Car {

	 IEngine engine;




	public IEngine getEngine() {
		return engine;
	}


	public void setEngine(IEngine engine) {
		this.engine = engine;
	}


	public void drive() {
		int start = engine.start();
		if(start>=1) {
			System.out.println("Car is started...");
		}else {
		System.out.println("Car is in troble...");
	}
	}

}
