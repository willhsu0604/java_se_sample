package com.will.ch_8;

public class ArrayOneDimension_8_1 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int i = 0; i < array.length; i ++) {
			sum += array[i];
		}
		System.out.println("sum = " + sum);

	}

}
