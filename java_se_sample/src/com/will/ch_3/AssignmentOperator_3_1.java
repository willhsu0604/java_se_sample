package com.will.ch_3;

public class AssignmentOperator_3_1 {

	public static void main(String[] args) {
	
		int a = 2;
		System.out.println("a = " + a);
		a += 2;
		System.out.println("a = " + a);
		a -= 2;
		System.out.println("a = " + a);
		
//		a = a + 2.0; // Compile error, 因為右邊的型別不能大於左邊的型別
	
//		a += 2.0;	// 實際上沒有錯誤，為什麼？
		
	}
	
}
