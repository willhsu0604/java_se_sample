package com.will.ch_5;

public class BreakContinue_5_1 {
	
	public static void main(String[] args) {
		
		System.out.println("一般的 for loop的結果");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("break的 for loop的結果");
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("contiue的 for loop的結果");
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
