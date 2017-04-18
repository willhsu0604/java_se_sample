package com.will.ch_11;

public class FiighterFuelMachine extends PlaneFuelMachine {
	
	public void attack() {
		System.out.println("發射飛彈!");
	}

	public double getFuelAmountEveryKM() {
		return 3.0;
	}

}
