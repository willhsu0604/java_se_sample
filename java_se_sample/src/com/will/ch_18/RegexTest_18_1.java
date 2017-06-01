package com.will.ch_18;

public class RegexTest_18_1 {

	public static void main(String[] args) {
		String str = "Java is great";
		System.out.println("str.matches(\"Java.+\"): " + str.matches("Java.+"));
		System.out.println("str.matches(\"Java.\"): " + str.matches("Java."));
		
		String[] array = str.split(" ");
		for(String s: array) {
			System.out.println(s);
		}
		
		String cellPhoneRegexPattern = "09\\d{2}-\\d{6}";
		System.out.println("is 0911123456 match regex? " + "0911123456".matches(cellPhoneRegexPattern));
		System.out.println("is 0911-123456 match regex? " + "0911-123456".matches(cellPhoneRegexPattern));
	}

}
