package com.org.tcs;

public class MainTest {
	public static void main(String[] args) {
		Car car=new Car();
		//car.setEngine(new PetrolEngine());//constructoe Injection
		//car.setEngine(new PetrolEngine());//setter Injection
		car.engine=new PetrolEngine();//fiels Injection
		car.drive();
		
	}

}
