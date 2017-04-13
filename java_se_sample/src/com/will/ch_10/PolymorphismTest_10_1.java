package com.will.ch_10;

public class PolymorphismTest_10_1 {
	
	public static void main(String[] args) {
		Employee e = new FullTimeEmployee(1, "will", 3000);
		FullTimeEmployee f = new FullTimeEmployee(1, "will", 3000);
		System.out.println("e.getSalary(): " + e.getSalary());
		System.out.println("f.getSalary(): " + f.getSalary());
	}

}
