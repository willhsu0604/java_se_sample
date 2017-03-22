package com.will.ch_3;

public class ShiftOperators_3_1 {

	public static void main(String[] args) {
		
		int a = 0b111;
		System.out.println("a = " + a);
		a = a >> 1;
		System.out.println("a >> 1 : " + Integer.toBinaryString(a));
		System.out.println("a = " + a);
		a = a << 2;
		System.out.println("a >> 1 : " + Integer.toBinaryString(a));
		System.out.println("a = " + a);
		
	}
	
}
