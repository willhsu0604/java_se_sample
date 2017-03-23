package com.will.ch_3;

public class ArithmeticOperators_3_1 {

	public static void main(String[] args) {
		
		// 數字相加
		System.out.println("1 + 1 = " + (1 + 1));
		
		// 字串相加
		System.out.println("\"1\" + 1 = " + "1" + 1);
		
		System.out.println("1 + 1 = " + 1 + 1);
		
		int a = 1;
		double b = 1.0;
		// 字串相加
//		int sum = a + b;	// Compile error 因為轉型後為double型態
		System.out.println("a + b = " + (a + b));
		
		System.out.println("(5.0/2) = " + (5.0/2));
		System.out.println("(5/2) = " + (5/2));
		
		byte c = 1;
		byte d = 1;
//		byte e = c + d; // Compile error ，若兩個運算元為基本型別，至少會轉換成int型別
		int f = c + d;
		System.out.println("c + d = " + f);
		
		// 小數點計算不精確
		double d1 = 0.1;
		double d2 = 0.1;
		System.out.println("d1 + d2 = " + (d1 + d2));
	}
	
}
