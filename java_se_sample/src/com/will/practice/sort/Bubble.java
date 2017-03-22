package com.will.practice.sort;

public class Bubble extends SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		for(int i = array.length - 1; i > 1; i--) {
			for(int j = i; j > 0; j--) {
				if(array[j-1] > array[j]) {
					array = swap(array, j-1, j);
				}
			}
		}
		return array;
	}

}
