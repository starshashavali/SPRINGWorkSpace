package com.injection.demo;

public class Test {
	public static void main(String[] args) {
		Car car=new Car(new DebitCard());
		car.drive();
	}

}
