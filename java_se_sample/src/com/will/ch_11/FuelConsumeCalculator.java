package com.will.ch_11;

public class FuelConsumeCalculator {

	public static void cal(Plane plane, double fuelAmountEveryKM) {
		System.out.println("共消耗" + plane.getTotalDistanceInKm() * fuelAmountEveryKM + "公升的油"); 
	}
	
	public static void cal(Car car, double fuelAmountEveryKM) {
		System.out.println("共消耗" + car.getTotalDistance()/1000 * fuelAmountEveryKM + "公升的油");
	}
	
}
