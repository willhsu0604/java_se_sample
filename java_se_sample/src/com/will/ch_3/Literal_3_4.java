package com.will.ch_3;

public class Literal_3_4 {
	
	public static void main(String[] args) {
		
		byte a = 1;
		short b = 1;
		int c = 1;
		long d = 1L;
		
		float e = 1.1f;
		double f = 1.1;
		double g = 1.1D;
		
		boolean h = true;
		boolean i = false;
		char j = 'A';
		char k = '\u0041';
		
		// char
		System.out.println("a => " + 'a');
		System.out.println("我 => " + '我');
		
		// 轉義序列
		System.out.println("單引號 => " + '\'');
		System.out.println("雙引號 => " + '\"');
		System.out.println("反斜線 => " + '\\');
		System.out.println("換行 => " + '\n');
		System.out.println("tab鍵 => " + '\t');
		System.out.println("倒退一格 => " + '\b');
		System.out.println("換頁 => " + '\f');
		System.out.println("return鍵 (Enter鍵) => " + '\r');
		
	}
	
}
