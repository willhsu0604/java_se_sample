package com.will.ch_11;

public class FuelConsumeCalculator2 {

	public static void cal(FuelMachine fuelMachine, double fuelAmountEveryKM) {
		System.out.println("共消耗" + fuelMachine.getFuelAmountEveryKM() * fuelMachine.getTotalDistanceInKm()  + "公升的油");
	}

}
