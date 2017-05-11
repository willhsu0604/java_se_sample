package com.will.ch_15;

import java.io.Serializable;

public class Person implements Serializable {

	private String name;
	private int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
