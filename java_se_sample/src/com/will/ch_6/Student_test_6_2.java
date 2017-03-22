package com.will.ch_6;

public class Student_test_6_2 {
	
	public static void printlnInt(int i) {
		System.out.println(i);
	}
	
	public static void printlnLong(long i) {
		System.out.println(i);
	}
	
	public static void printlnDouble(double i) {
		System.out.println(i);
	}
	
	public static void printlnString(String i) {
		System.out.println(i);
	}
	
	public static void println(int i) {
		System.out.println(i);
	}
	
	public static void println(long i) {
		System.out.println(i);
	}
	
	public static void println(double i) {
		System.out.println(i);
	}
	
	public static void println(String i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		printlnInt(1);
		printlnLong(1L);
		printlnDouble(1.0);
		printlnString("a");
		
		// vs
		
		println(1);
		println(1L);
		println(1.0);
		println("a");
		
	}

}
