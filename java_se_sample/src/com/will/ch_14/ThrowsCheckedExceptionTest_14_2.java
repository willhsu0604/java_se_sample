package com.will.ch_14;

public class ThrowsCheckedExceptionTest_14_2 {
	
	static int[] array = new int[3];

	public static void main(String[] args) {
		// Will throws error if not 
		//System.out.println(array[index]);
		
		int index = 3;
		try {
			System.out.println(array[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("索引" + index + "超過陣列的範圍了哦!");
		} 
	}

}
