package com.will.ch_8;

public class VarargsAppendString_8_1 {
	
	public static String append(String... strs) {
		String str = "";
		for(int i = 0; i < strs.length; i ++) {
			str += strs[i];
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		System.out.println(append("c", "a", "t"));
		System.out.println(append("h", "e", "l", "l", "o"));
		
	}

}
