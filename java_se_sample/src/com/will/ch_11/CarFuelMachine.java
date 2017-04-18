package com.will.ch_11;

public abstract class CarFuelMachine implements FuelMachine {
	
	private int totalDistance;
	
	public void move(int distance) {
		System.out.println("行駛了" + distance + "公尺");
		totalDistance += distance;
	}
	
	public int getTotalDistance() {
		return totalDistance;
	}
	
	public int getTotalDistanceInKm() {
		return totalDistance/1000;
	}


}
