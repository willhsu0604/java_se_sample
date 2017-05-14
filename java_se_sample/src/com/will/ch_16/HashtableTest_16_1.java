package com.will.ch_16;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableTest_16_1 {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("one", new Integer(1));
		ht.put("two", "2");
		ht.put("three", new Float(3.0));
		
		System.out.println("ht.toString(): " + ht.toString());
		System.out.println("ht.size(): " + ht.size());
		
		Set keyset = ht.keySet();
		Iterator it = keyset.iterator();
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key + "=" + ht.get(key));
		}
	}

}
