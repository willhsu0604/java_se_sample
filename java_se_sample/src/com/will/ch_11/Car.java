package com.will.ch_11;

public abstract class Car {
	
	private int totalDistance;
	
	public void move(int distance) {
		System.out.println("行駛了" + distance + "公尺");
		totalDistance += distance;
	}
	
	public int getTotalDistance() {
		return totalDistance;
	}

}
