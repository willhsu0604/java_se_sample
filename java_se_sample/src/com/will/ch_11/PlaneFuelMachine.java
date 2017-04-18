package com.will.ch_11;

public abstract class PlaneFuelMachine implements FuelMachine {
	
	private int totalDistanceInKm;
	
	public void fly(int distanceInKm) {
		System.out.println("飛了" + distanceInKm + "公里");
		totalDistanceInKm += distanceInKm;
	}

	public int getTotalDistanceInKm() {
		return totalDistanceInKm;
	}

}
