package com.will.ch_16;

public class Person implements Comparable<Person> {

	private String name;
	private double weight;
	private double height;
	
	public Person(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person o) {
		return (int)(this.weight - o.weight);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

}
