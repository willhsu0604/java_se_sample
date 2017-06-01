package com.will.ch_18;

public class StringBuffer_18_1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Java ");
		sb.append("is ");
		sb.append("awesome ");
		System.out.println(sb.toString());
		sb.setLength(0);
		sb.append("Hello");
		System.out.println(sb.toString());
	}

}
