package com.will.ch_8;

public class StringFunction_8_1 {
	
	public static void main(String[] args) {
		
		String s = "藍瘦香菇";
		String emptyStr = "";
		String emptyStrWithSpace = " ";
		System.out.println("s.charAt(1) : " + s.charAt(2));
		System.out.println("s.length() : " + s.length());
		System.out.println("s.substring(1) : " + s.substring(1));
		System.out.println("s.substring(2, 4) : " + s.substring(2, 4));
		System.out.println("s.isEmpty() : " + s.isEmpty());
		System.out.println("emptyStr.isEmpty() : " + emptyStr.isEmpty());
		System.out.println("emptyStrWithSpace.isEmpty() : " + emptyStrWithSpace.isEmpty());
		
		
		String a = "abc";
		String b = "abd";
		System.out.println("a.compareTo(b) : " + a.compareTo(b));
		
		
		
		
	}

}
