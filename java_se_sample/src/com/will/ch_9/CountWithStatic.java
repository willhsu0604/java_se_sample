package com.will.ch_9;

public class CountWithStatic {
	
	private int serialNumber;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	private static int counter;
	static {
		counter = 0;
		System.out.println("初始數量: " + Count.getTotalCount());
	}
	public static int getTotalCount() {
		return counter;
	}
	
	public CountWithStatic() {
		counter ++;
		serialNumber = 1000 * counter;
	}

}
