package com.will.ch_3;

public class Literal_3_1 {
	
	public static void main(String[] args) {
		//	十進位
		System.out.println("12345 => " + 12345);
		
		// 八進位
		System.out.println("0111 => " + 0111);
		
		// 十六進位
		System.out.println("0x8E => " + 0x8E);
		System.out.println("0X8E => " + 0X8E);
		
		// 二進位
		System.out.println("0b1001 => " + 0b1001);
		System.out.println("0B1001 => " + 0B1001);
		
		// 可使用底線（_）來分隔整數定數
		System.out.println("12_345 => " + 12_345);
		System.out.println("0b1_001 => " + 0b1_001);
		
		// 底線（_）不可放置頭或尾
//		System.out.println("_12345  => " + _12345);	// Compile error
//		System.out.println("12345_  => " + 12345_);	// Compile error
//		System.out.println("0b_1001 => " + 0b_1001); // Compile error
		
	}
	
}
