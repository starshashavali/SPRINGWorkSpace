package com.tcs.spring;

public class Payment {
	
	private IPayment payment;

	public Payment(IPayment payment) {
		this.payment = payment;
	}
	
	public void doBilling() {
		boolean status = payment.billProcess();
		if(status) {
			System.out.println("bll is printing...");
		}else {
			System.out.println("bill is not printing...");
		}
	}
	

}
