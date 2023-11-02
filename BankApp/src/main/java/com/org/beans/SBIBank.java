package com.org.beans;

import org.springframework.stereotype.Component;

@Component
public class SBIBank implements IBank {
	
	public SBIBank() {
	System.out.println("SBI-) params");
	}

	@Override
	public String fixedRate() {
		return "200.0";
	}

}
