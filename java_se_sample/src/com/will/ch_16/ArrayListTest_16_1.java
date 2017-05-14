package com.will.ch_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest_16_1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(12));
		list.add(new Long(14L));
		list.add(new Double(12.4));
		list.add("Hello");
		
		System.out.println("list.toString(): " + list.toString());
		System.out.println("list.size(): " + list.size());
		
		System.out.println("Using Iterator: ");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using for-loop: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
