package com.will.ch_8;

public class ArrayReferenceAssignment_8_2 {
	
	
	public static void changeArrayValues(int[] array) {
		for(int i = 0; i < array.length; i ++) {
			array[i] = -1;
			System.out.println("array[" + i + "] change to " + array[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		changeArrayValues(array);
		
		for(int i = 0; i < array.length; i ++) {
			System.out.println("original array[" + i + "] = " + array[i]);
		}
		
	}

}
