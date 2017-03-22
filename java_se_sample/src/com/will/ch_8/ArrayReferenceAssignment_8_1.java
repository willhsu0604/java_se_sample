package com.will.ch_8;

public class ArrayReferenceAssignment_8_1 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] array_2 = array;
		
		for(int i = 0; i < array_2.length; i ++) {
			System.out.println("array_2[" + i + "] = " + array_2[i]);
			array_2[i] = -1;
		}
		
		for(int i = 0; i < array.length; i ++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}

	}

}
