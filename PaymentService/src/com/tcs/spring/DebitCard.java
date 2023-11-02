package com.tcs.spring;

public class DebitCard  implements IPayment{

	@Override
	public boolean billProcess() {
		System.out.println("Debit Card ");
		return true;
	}

}
