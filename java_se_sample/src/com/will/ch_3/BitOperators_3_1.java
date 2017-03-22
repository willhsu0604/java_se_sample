package com.will.ch_3;

public class BitOperators_3_1 {
	
	public static void main(String[] args) {
		
		byte a = 0b00000000000000000000000000000000;
		int b = 0b11111111111111111111111111111111;
		int c = 0b11100111111111001111111111111111;
		int d = 0b00100111111111001111101111111011;
		
		System.out.println(" ~a: " + Integer.toBinaryString(~a));
		System.out.println("b&c: " + Integer.toBinaryString(b&c));
		System.out.println("c|d: " + Integer.toBinaryString(c|d));
		System.out.println("c^d: " + Integer.toBinaryString(c^d));
		
	}

}
