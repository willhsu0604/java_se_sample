package com.will.ch_9;

public class Count {
	
	private int serialNumber;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	private static int counter;
	
	public static int getTotalCount() {
		return counter;
	}
	
	public Count() {
		counter ++;
		serialNumber = 1000 * counter;
	}

}
