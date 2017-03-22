package com.will.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RandomCard {
	
	public static void main(String[] args) {
		int[] cards = new int[52];
		int i = 0;
		tag: while(i < cards.length) {
			int shape = 1 + (int)(Math.random() * 4);
			int number = 1 + (int)(Math.random() * 13);
			int carNum = shape* 100 + number;
			
			for(int j = 0; j < i; j++) {
				if(carNum == cards[j]) {
					continue tag;
				}
			}
			cards[i] = carNum;
			i++;
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int j = 0; j < cards.length; j++) {
			set.add(cards[j]);
		}
		System.out.println(set.size());
  	}

}
