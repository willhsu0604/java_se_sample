package com.will.practice;

public class Hanoi {
	
	int[][] arrays = null;
	
	public Hanoi(int stickNum, int plateNum) {
		arrays = new int[stickNum][plateNum];
		for(int i = 0; i < arrays[0].length; i ++) {
			arrays[0][i] = i + 1;
		}
	}
	
	public boolean move(int fromPos, int toPos) {
		int fromValue = 0;
		int toValue = 0;
		int fromIndex = 0;
		int toIndex = 0;
		
		for(int j = 0; j < arrays[fromPos].length; j ++) {
			fromIndex = j;
			if(arrays[fromPos][j] > fromValue) {
				fromValue = arrays[fromPos][j];
				break;
			}
		}
		
		for(int j = 0; j < arrays[toPos].length; j ++) {
			toIndex = j;
			if(arrays[toPos][j] > toValue) {
				toValue = arrays[toPos][j];
				toIndex = toIndex - 1;
				break;
			}
		}
		
		if(fromValue <= toPos) {
			arrays[toPos][toIndex] = arrays[fromPos][fromIndex];
			arrays[fromPos][fromIndex] = 0;
			return true;
		} else {
			return false;
		}
		
	}
	
	public void print() {
		int max = 0;
		int maxs[] = new int[arrays.length];
		for(int i = 0; i < arrays.length; i ++) {
			int[] array = arrays[i];
			for(int j = 0; j < array.length; j ++) {
				int value = array[j];
				if(value > max) {
					max = value;
				}
				if(value >= maxs[i]) {
					maxs[i] = value;
				}
			}
		}
		
		StringBuilder[] sbs = new StringBuilder[max];
		for(int i = 0; i < arrays.length; i ++) {
			for(int j = 0; j < arrays[i].length; j ++) {
				if(sbs[j] == null) {
					sbs[j] = new StringBuilder();
				}
				int size = maxs[i];
				sbs[j].append('|');
				for(int k = 0; k < size; k ++) {
					if(k >= arrays[i][j]) {
						sbs[j].append(' ');
					} else {
						sbs[j].append('-');
					}
					
				}
				sbs[j].append("\t");
			}
		}
		
		for(int i = 0; i < sbs.length; i ++) {
			System.out.println(sbs[i].toString());
		}
		System.out.println();
		System.out.println();
	}
}