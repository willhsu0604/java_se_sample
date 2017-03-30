package com.will.ch_5;

public class WhileComparison_5_1 {
	
	public static void main(String[] args) {
		
		System.out.println("While-Do");
		int i = 100;
		while (i <= 10) {
		  System.out.println(i);
		  i--;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Do-While");
		int j = 100;
		do {
		  System.out.println(j);
		  j--;
		} while (j <= 10);

		System.out.println("至少會跑一次");
		
		System.out.println();
		System.out.println();
		int count = 1;
		while ( count++ < 5) {
			System.out.println("count = " + count);
		}
		System.out.println("final count = " + count);
		
	}

}
