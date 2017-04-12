package com.will.practice.sort;

public class MergeSort extends SortAlgorithm  {

	@Override
	public int[] sort(int[] array) {
		sort(array, 0, array.length - 1);
		return array;
	}
	
	private void sort(int[] array, int start, int end) {
		if(start == end) {
			return;
		}
		
		if (end - start == 1) {
			if(array[start] > array[end]) {
				swap(array, start, end);
			}
		} else {
			int middle = (end - start)/2 + start;
			sort(array, start, middle);
			sort(array, middle + 1, end);
			merge(array, start, middle, end);
		}
	}
	
	
	private int[] merge(int[] array, int start, int middle, int end) {
		int lIndex = start, rIndex = middle+1, index = 0, rightStart = middle+1;
		int lLength = middle + 1 - start;
		int rLength = end - middle ;
		int[] helper = new int[end - start + 1];
		while(lIndex - start < lLength || rIndex - rightStart < rLength) {
			if(lIndex - start == lLength) {
				helper[index] = array[rIndex];
				rIndex++;
			} else if (rIndex - rightStart == rLength) {
				helper[index] = array[lIndex];
				lIndex++;
			} else {
				if(array[lIndex] >=  array[rIndex]) {
					helper[index] = array[rIndex];
					rIndex++;
				} else {
					helper[index] = array[lIndex];
					lIndex++;
				}
			}
			index++;
		}
		for(int i = 0; i < helper.length; i++) {
			array[start + i] = helper[i];
		}
		return array;
	}
	
}
