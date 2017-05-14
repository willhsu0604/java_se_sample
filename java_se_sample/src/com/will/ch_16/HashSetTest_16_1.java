package com.will.ch_16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest_16_1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Integer(12));
		set.add(new Long(14L));
		set.add(new Double(12.4));
		set.add("Hello");
		set.add("Hello");
		
		System.out.println("set.toString(): " + set.toString());
		System.out.println("set.size(): " + set.size());
		
		System.out.println("Using Iterator: ");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
