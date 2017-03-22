package com.will.ch_7;

public class PassByTypeComparison_7_1 {
	
	public static void testPassByValue(double value) {
		value = 20.0;
		System.out.println("Change value, value = " + value);
	}
	
	public static void testPassByReference(Pen pen) {
		pen.price = 20;
		System.out.println("Change price, pen.price = " + pen.price);
	}

	public static void main(String[] args) {
		
		double value = 10.0;
		System.out.println("Before calling testPassByValue, value = " + value);
		testPassByValue(value);
		System.out.println("After calling testPassByValue, value = " + value);
		
		Pen pen = new Pen();
		pen.price = 10;
		System.out.println("Before calling testPassByValue, pen.price = " + pen.price);
		testPassByReference(pen);
		System.out.println("After calling testPassByValue, pen.price = " + pen.price);
		
	}
}
