package com.will.ch_3;

public class RelationalOperators_3_1 {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		System.out.println("a > b : " + (a > b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a != b : " + (a != b));
		System.out.println("a == b : " + (a == b));
		
		boolean c = (a == b);
//		boolean d = (a = b) // Compile error, "=" is assignment operator, not relational Operator
		
	}

}
