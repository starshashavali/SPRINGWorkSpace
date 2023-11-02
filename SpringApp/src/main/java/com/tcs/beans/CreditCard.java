package com.tcs.beans;

public class CreditCard implements IPayment{

	public CreditCard() {
		System.out.println("DebitCard :: Constructor");
	}
	@Override
	public boolean billProcess(Double amount) {
		System.out.println(" Credit card bill Payment...");
		return true;
	}

}
