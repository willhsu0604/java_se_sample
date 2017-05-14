package com.will.ch_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnhancedForLoopTest_16_1 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Using for-loop");
		for(Integer i: list) {
			System.out.println(i);
		}
		
		System.out.println("Using iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
