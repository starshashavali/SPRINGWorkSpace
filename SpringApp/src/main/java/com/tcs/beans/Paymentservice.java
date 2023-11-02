package com.tcs.beans;

public class Paymentservice {

	private IPayment payment;

	public Paymentservice() {
		System.out.println("Zero parameter constructor ::");
	}

	public Paymentservice(IPayment payment) {
		System.out.println(" payment Parameter Parameter:: executed...");
		this.payment = payment;
	}

	public IPayment getPayment() {
		return payment;
	}

	public void setPayment(IPayment payment) {
		System.out.println("Setter injection:::");
		this.payment = payment;
	}

	public void doBilling(Double amounnt) {
		boolean bill = payment.billProcess(amounnt);
		if (bill) {
			System.out.println("bill amount is debited...");
		} else {
			System.out.println("problem occure...");
		}

	}

}
