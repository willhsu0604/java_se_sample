package com.will.ch_14;

public class ExceptionFlowTest_14_1 {
	
	public static void method() {
		// ArrayIndexOutOfBoundsException Occurred
		int[] array = new int[1];
		System.out.println(array[1]);
		
		// NumberForamtException Occurred
//		Integer.valueOf("gg");
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("0");
			method();
			System.out.println("1");
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
	}

}
