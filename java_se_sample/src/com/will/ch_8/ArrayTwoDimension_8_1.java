package com.will.ch_8;

public class ArrayTwoDimension_8_1 {

	public static void main(String[] args) {
		
		int[][] array = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
		};
		int sum = 0;
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j ++) {
				sum += array[i][j];
			}
		}
		System.out.println("sum = " + sum);

	}

}
