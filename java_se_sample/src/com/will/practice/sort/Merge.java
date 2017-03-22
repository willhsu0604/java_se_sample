package com.will.practice.sort;

public class Merge extends SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		mergesort(array, 0, array.length - 1);
		return array;
	}
	
	private int[] mergesort(int[] array, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int middleIndex = (endIndex + startIndex) / 2; 
			array = mergesort(array, startIndex, middleIndex);
			array = mergesort(array, middleIndex + 1, endIndex);
			array = merge(array, startIndex, middleIndex, endIndex);
		}
		return array;
	}
	
	private int[] merge(int[] array, int startIndex, int middleIndex, int endIndex) {
		int[] helper = new int[array.length];
		for (int i = startIndex; i <= endIndex; i++) {
			helper[i] = array[i];
		}
		int i = startIndex;
        int j = middleIndex + 1;
        int k = startIndex;
        while (i <= middleIndex && j <= endIndex) {
            if (helper[i] <= helper[j]) {
            	array[k] = helper[i];
            	i++;
            } else {
            	array[k] = helper[j];
            	j++;
            }
            k++;
        }
        
        while (i <= middleIndex) {
        	array[k] = helper[i];
            k++;
            i++;
        }
        return array;
	}

}
