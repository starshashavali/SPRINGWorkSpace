package com.org.beans;

import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private Chip chip;//has -a
	public Robot() {
		System.out.println("Default construct::-0");
	}

	public Robot(Chip chip) {
		System.out.println("Parameterized ::");
		this.chip = chip;
	}
	public void dowork() {
		String chipType = chip.getChipType();
		if(chipType.equals("32-Bits")) {
			System.out.println("Robot is started...");
		}else {
			System.out.println("Something went wrong...");
		}
	}
	
	
	

}
