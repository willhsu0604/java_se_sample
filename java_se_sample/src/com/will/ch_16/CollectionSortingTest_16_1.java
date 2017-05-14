package com.will.ch_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionSortingTest_16_1 {

	public static void main(String[] args) {
		System.out.println("Usning Arrays");
		int[] array = {
			1, 3, 7, 2	
		};
		
		Arrays.sort(array);
		for(int i: array) {
			System.out.println(i);
		}
		
		System.out.println("Usning TreeSet");
		Set<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(3);
		set.add(7);
		set.add(2);
		System.out.println(set);
		
		System.out.println("Usning TreeMap`");
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, null);
		map.put(3, null);
		map.put(7, null);
		map.put(2, null);
		System.out.println(map);
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("will", 85, 185));
		list.add(new Person("janet", 50, 162));
		list.add(new Person("fanet", 53, 170));
		Collections.sort(list);
		System.out.println("Sorting with weight");
		for(Person person: list) {
			System.out.println(person);
		}
		
		list.sort(new Comparator<Person>()  {

			@Override
			public int compare(Person o1, Person o2) {
				return (int)(o1.getHeight() - o2.getHeight());
			}
			
		});
		System.out.println("Sorting with height");
		for(Person person: list) {
			System.out.println(person);
		}
	}

}
