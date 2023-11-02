package com.org.beans;

import org.springframework.stereotype.Repository;

@Repository("bank")
public class AXISBank implements IBank {
	public AXISBank() {
	System.out.println("Axis bank 0-param");
	}

	@Override
	public String fixedRate() {
		return "98.8";
	}

}
