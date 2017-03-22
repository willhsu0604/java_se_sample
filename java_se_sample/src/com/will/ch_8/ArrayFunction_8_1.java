package com.will.ch_8;

import java.util.Arrays;

public class ArrayFunction_8_1 extends Object {
	
	
	public static void main(String[] args) {
		
		int[] array = {1, 10, 5, 7, 6, 3, 5};

		// 排序
		Arrays.sort(array);
		System.out.println("排序後的值");
		for(int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		System.out.println();
		System.out.println();
		// 二分搜索法
		int position = Arrays.binarySearch(array, 5);
		System.out.println("Find index of 5 in array: " + position);
		position = Arrays.binarySearch(array, 4);
		System.out.println("Find index of 4 in array: " + position);
	
		System.out.println();
		System.out.println();
		int[] array2 = Arrays.copyOf(array, array.length);
		System.out.println("改變複製陣列的值");
		for(int i = 0; i < array2.length; i++) {
			array2[i] = -1;
		}
		System.out.println("不影響原本的陣列");
		for(int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
	}

}
