package com.will.ch_18;

public class StringBuilder_18_1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("is ");
		sb.append("awesome ");
		System.out.println(sb.toString());
		sb.setLength(0);
		sb.append("Hello");
		System.out.println(sb.toString());
	}

}
