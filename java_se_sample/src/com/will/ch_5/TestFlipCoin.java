package com.will.ch_5;

public class TestFlipCoin {

	public static void main(String[] args) {
		int positiveCount = 0;
		int count = 0;
		do {
			count++;
			if(Math.random() < 0.5) {
				System.out.println("第" + count + "次: 反面");
				positiveCount = 0;
			} else {
				System.out.println("第" + count + "次: 正面");
				positiveCount ++;
			}
		} while (positiveCount < 3);

	}

}
