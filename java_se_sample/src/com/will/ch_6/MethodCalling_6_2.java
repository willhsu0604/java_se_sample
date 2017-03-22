package com.will.ch_6;

public class MethodCalling_6_2 {
	
	public static int sum(int a, int b, int c) {
		return a + b+ c;
	}

	public static void main(String[] args) {
		
		int sumByValues = sum(1, 2, 3);
		System.out.println("sumByValues = " + sumByValues);
		
		int a = 1;
		int b = 2;
		int c = 3;
		int sumByVariables = sum(a, b, c);
		System.out.println("sumByVariables = " + sumByVariables);

	}

}
