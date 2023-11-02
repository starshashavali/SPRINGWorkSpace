package com.injection.demo;

public class Car {
	
	private IEngine engine;//has-A
//constructor Injection
	public Car(IEngine engine) {
		this.engine = engine;
	}
	public void drive() {
		engine.doProcess();
		
	}
	

}
