package com.will.practice.sort;

public class Insertion extends SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			for(int j = i; j > 0 && array[j-1] > array[j] ; j--) {
				array = swap(array, j-1, j);
			}
		}
		return array;
	}

}
