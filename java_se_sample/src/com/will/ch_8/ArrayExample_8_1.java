package com.will.ch_8;

public class ArrayExample_8_1 {
	
	public static void main(String[] args) {
		
		int[] array = new int[3];
		array[1] = 100;
		array[2] = 200;
		
		for(int i = 0; i < array.length; i ++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
	} 

}
