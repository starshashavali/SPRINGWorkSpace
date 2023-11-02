package com.tcs.beans;

public class DebitCard implements IPayment{
	public DebitCard() {
		System.out.println("DebitCard :: Constructor");
	}

	@Override
	public boolean billProcess(Double amount) {
	
		System.out.println("Debit card Payment...");
		return true;
	}

}
