package com.will.ch_8;

import com.will.ch_7.Pen;

public class ArrayExample_8_2 {
	
	public static void main(String[] args) {
		
		int[] intArray1 = new int[3];
		intArray1[0] = 10;
		intArray1[1] = 20;
		intArray1[2] = 30;
		
		int[] intArray2 = {10, 20, 30};
		
		String[] stringArray1 = new String[3];
		stringArray1[0] = "first";
		stringArray1[1] = "second";
		stringArray1[1] = "third";
		
		String[] stringArray2 = {"first", "second", "third"};
		
		Pen[] penArray1 = new Pen[3];
		penArray1[1] = new Pen();
		penArray1[1] = new Pen();
		penArray1[2] = new Pen();
		
		Pen[] penArray2 = {new Pen(), new Pen(), new Pen()};
		
	} 

}
