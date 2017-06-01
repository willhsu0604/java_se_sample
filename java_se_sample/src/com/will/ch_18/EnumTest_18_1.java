package com.will.ch_18;

enum COLOR {
	R, G, B
}

public class EnumTest_18_1 {
	
	public static String getColorName(char color) {
		String fullColorName = "";
		switch(color) {
			case 'R': {
				fullColorName = "Red";
				break;
			}
			case 'G': {
				fullColorName = "Green";
				break;
			}
			case 'B': {
				fullColorName = "Blue";
				break;
			}
			default: {
				throw new RuntimeException("No matched color is found");
			}
		}
		return fullColorName;
	}
	
	public static String getColorName(COLOR color) {
		String fullColorName = "";
		switch(color) {
			case R: {
				fullColorName = "Red";
				break;
			}
			case G: {
				fullColorName = "Green";
				break;
			}
			case B: {
				fullColorName = "Blue";
				break;
			}
		}
		return fullColorName;
	}
	
	public static void main(String[] args) {
		System.out.println(getColorName('R'));
		System.out.println(getColorName('G'));
		System.out.println(getColorName('E'));
		System.out.println(getColorName(COLOR.R));
		System.out.println(getColorName(COLOR.G));
	}

}
