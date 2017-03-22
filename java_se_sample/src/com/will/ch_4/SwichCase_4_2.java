package com.will.ch_4;

public class SwichCase_4_2 {
	
	public static void main(String[] args) {
		
		String n = "b";
		// With break
		System.out.println("有break");
		switch (n) {
			case "a":
				System.out.println("您選擇的是a方案");
				break;
			case "b":
				System.out.println("您選擇的是b方案");
				break;
			default:
				System.out.println("您選擇的是其他方案");
				break;
		}
		
		System.out.println();
		System.out.println("沒有break");
		// Without break
		switch (n) {
			case "a":
				System.out.println("您選擇的是a方案");
			case "b":
				System.out.println("您選擇的是b方案");
			default:
				System.out.println("您選擇的是其他方案");
		}
		
	}

}
