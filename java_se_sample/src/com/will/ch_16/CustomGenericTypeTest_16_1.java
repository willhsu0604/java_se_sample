package com.will.ch_16;

import java.util.ArrayList;
import java.util.List;

public class CustomGenericTypeTest_16_1 {
	
	public static void main(String[] args) {
		CustomGenericList<String> gList = new CustomGenericList<>();
		gList.add("Hello");
		gList.add("World");
		System.out.println(gList);
	}

}

class CustomGenericList<T> {
	private List<T> list = null;
	
	public CustomGenericList() {
		this.list = new ArrayList<>();
	}
	
	public void add(T t) {
		this.list.add(t);
	}
	
	public String toString() {
		return this.list.toString();
	}
	
}
