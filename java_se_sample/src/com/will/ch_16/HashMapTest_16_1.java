package com.will.ch_16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest_16_1 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("one", new Integer(1));
		map.put("two", "2");
		map.put("three", new Float(3.0));
		
		System.out.println("map.toString(): " + map.toString());
		System.out.println("map.size(): " + map.size());
		
		Set keyset = map.keySet();
		Iterator it = keyset.iterator();
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key + "=" + map.get(key));
		}
	}

}
