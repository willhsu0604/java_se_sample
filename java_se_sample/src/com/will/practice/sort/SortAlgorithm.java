package com.will.practice.sort;

public abstract class SortAlgorithm {
	
	public abstract int[] sort(int[] array);
	
	public int[] swap(int[] array, int pos1, int pos2) {
		int tmp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = tmp;
		return array;
	}

}
