package com.will.ch_16;

import java.util.HashMap;
import java.util.Map;

public class GenericMapTest_16_1 {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		for(int i = 0; i < 3; i++) {
			map.put(i, "Number " + i);
		}
		
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		System.out.println(map.get(2));
	}

}
