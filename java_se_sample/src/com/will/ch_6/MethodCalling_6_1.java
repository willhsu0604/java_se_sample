package com.will.ch_6;

public class MethodCalling_6_1 {
	
	public static void test() {
		System.out.println("Now i am in test method");
	}

	public static void main(String[] args) {
		
		System.out.println("I am in main method");
		System.out.println("Calling test method");
		test();
		System.out.println("Now i am back to main method");

	}

}
