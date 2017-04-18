package com.will.ch_14;

public class CustomizedExceptionTest_14_1 {

	public static void main(String[] args) throws InBadMoodExeception {
		int day = (int)(Math.random() * 30) + 1;
		System.out.println("這個月的第" + day + "天");
		if(day <= 5) {
			throw new InBadMoodExeception("老婆:今天吃自己");
		} else {
			System.out.println("老婆:煮好吃的飯給你吃");
		}
	}

}
