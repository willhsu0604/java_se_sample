package com.will.ch_8;

public class StringTestImmutable_8_1 {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(" s1 == s2 : " + (s1 == s2));
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(" s3 == s4 : " + (s3 == s4));
		
		// 重要!!!當String使用 == 比較時，比較的是變數存的記憶體位址，而不是變數的值
		
		// String必須使用
//		System.out.println(" s3.equals(s4) : " + s3.equals(s4));
		
	}

}
