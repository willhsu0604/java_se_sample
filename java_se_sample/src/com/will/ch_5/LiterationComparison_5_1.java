package com.will.ch_5;

public class LiterationComparison_5_1 {

	public static void main(String[] args) {
		
		System.out.println("for loop");
		int sum = 0;
		int count;
		for (count = 1; count <= 10; count++) {
			sum += count;
		}
		System.out.println("sum = " + sum);
		System.out.println("count = " + count);
		
		System.out.println();
		System.out.println();
		System.out.println("while loop");
		sum = 0;
		count = 1;
		while (count <= 10) {
			sum += count;
			count++;
		}
		System.out.println("sum = " + sum);
		System.out.println("count = " + count);
		
		System.out.println();
		System.out.println();
		System.out.println("do-while loop");
		sum = 0; 
		count = 1;
		do {
			sum += count;
			count++;
		} while (count <= 10);
		System.out.println("sum = " + sum);
		System.out.println("count = " + count);

	}

}
