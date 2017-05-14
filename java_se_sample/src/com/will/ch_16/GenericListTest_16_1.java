package com.will.ch_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericListTest_16_1 {

	public static void main(String[] args) {
		// Previous way
		List previousList = new ArrayList();
		previousList.add("Hello");
		previousList.add("World");
		Iterator it = previousList.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
		
		// Generic way
		List<String> genericList = new ArrayList<>();
		genericList.add("Hello");
		genericList.add("World");
		Iterator<String> gIt = genericList.iterator();
		while(gIt.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}

	}

}
