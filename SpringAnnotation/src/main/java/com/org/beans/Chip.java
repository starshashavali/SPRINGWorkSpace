package com.org.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
	System.out.println("chip _0");
	}
	public String getChipType() {
		return "32-Bits";
	}

}
