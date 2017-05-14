package com.will.ch_16;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumarationTest_16_1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Integer(12));
		v.add(new Long(14L));
		v.add(new Double(12.4));
		v.add("Hello");
		
		System.out.println("v.toString(): " + v.toString());
		System.out.println("v.size(): " + v.size());
		
		System.out.println("Using Enumeration: ");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("Using Iterator: ");
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using for-loop: ");
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

	}

}
