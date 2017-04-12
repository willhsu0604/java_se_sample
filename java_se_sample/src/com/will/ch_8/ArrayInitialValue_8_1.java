package com.will.ch_8;

import com.will.ch_7.Pen;

public class ArrayInitialValue_8_1 {
	
	public static void main(String[] args) {
		
		byte[] array1 = new byte[1];
		System.out.println("byte initial value: " + array1[0]);
		
		short[] array2 = new short[1];
		System.out.println("short initial value: " + array2[0]);
		
		int[] array3 = new int[1];
		System.out.println("int initial value: " + array3[0]);
		
		float[] array4 = new float[1];
		System.out.println("float initial value: " + array4[0]);
		
		double[] array5 = new double[1];
		System.out.println("double initial value: " + array5[0]);
		
		boolean[] array6 = new boolean[1];
		System.out.println("boolean initial value: " + array6[0]);
		
		char[] array7 = new char[1];
		System.out.println("char initial value: " + (int)(array7[0]));
		System.out.println("array7[0] == '\u0000' => " + (array7[0] == '\u0000'));
		
		Pen[] array8 = new Pen[1];
		System.out.println("Pen initial value: " + array8[0]);
		
	} 

}
