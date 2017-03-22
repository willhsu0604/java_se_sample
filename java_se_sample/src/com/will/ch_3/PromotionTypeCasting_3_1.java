package com.will.ch_3;

public class PromotionTypeCasting_3_1 {
	
	public static void main(String[] args) {
		
		int intI = 0;
		double doubleJ = 1.0;
		
		doubleJ =  doubleJ + intI;
		
//		intI =  doubleJ + intI; Complie error without typeCasting	 
		intI =  (int)(doubleJ + intI);
	
	}
	
}
