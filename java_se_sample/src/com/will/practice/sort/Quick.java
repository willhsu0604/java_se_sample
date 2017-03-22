package com.will.practice.sort;

public class Quick extends SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		return quickSort(array, 0, array.length - 1);
	}
	
	private int[] quickSort(int[] array, int startIndex, int endIndex) {
		int middleIndex = (startIndex + endIndex) / 2;
		int pivot = array[middleIndex];
		int startPos = startIndex;
		int endPos = endIndex;
		
		while(startPos <= endPos) {
			while(array[startPos] < pivot) {
				startPos++;
			}
			
			while(array[endPos] > pivot) {
				endPos--;
			}
			
			if(startPos <= endPos) {
				swap(array, startPos, endPos);
				startPos++;
				endPos--;
			}
		}
		
		if(startIndex < endPos) {
			array = quickSort(array, startIndex, endPos);
		}
		
		if(endIndex > startPos) {
			array = quickSort(array, startPos, endIndex);
		}
		
		return array;
	}

}
