package com.will.practice.sort;

public class Selection extends SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = i;
			for(int j = i; j < array.length; j++) {
				if(array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			array = swap(array, i, minIndex);
		}
		return array;
	}

}
