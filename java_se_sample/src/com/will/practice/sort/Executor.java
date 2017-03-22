package com.will.practice.sort;

public class Executor {
	
	public static void main(String[] args) {
		int[] array = {
				6, 3, 1, 7, 8, 4, 2, 9, 12, 10, 11
		};
		
		SortAlgorithm sa = new Quick();
		array = sa.sort(array);
		for(int value: array) {
			System.out.println(value);
		}
		
	}

}
