package com.will.ch_10;

public class TypeCasting_10_1 {
	
	public static void main(String[] args) {
		
		Employee e1 = new FullTimeEmployee(1, "will", 3000);
		Employee e2 = new PartTimeEmployee(2, "johnny", 10);
		
		System.out.println("e1 instanceof Employee: " + (e1 instanceof Employee));
		System.out.println("e1 instanceof FullTimeEmployee: " + (e1 instanceof FullTimeEmployee));
		System.out.println("e1 instanceof PartTimeEmployee: " + (e1 instanceof PartTimeEmployee));
		System.out.println("e2 instanceof Employee: " + (e2 instanceof Employee));
		System.out.println("e2 instanceof FullTimeEmployee: " + (e2 instanceof FullTimeEmployee));
		System.out.println("e2 instanceof PartTimeEmployee: " + (e2 instanceof PartTimeEmployee));
		
		FullTimeEmployee f = (FullTimeEmployee)e1;
		//PartTimeEmployee p1 = (PartTimeEmployee)e1; // 執行時會發生 java.lang.ClassCastException
		PartTimeEmployee p = (PartTimeEmployee)e2;
//		FullTimeEmployee f1 = (FullTimeEmployee)e2;
		
		System.out.println("f instanceof Employee: " + (f instanceof Employee));
		System.out.println("f instanceof FullTimeEmployee: " + (f instanceof FullTimeEmployee));
//		System.out.println("f instanceof PartTimeEmployee: " + (f instanceof PartTimeEmployee)); // Compile error, 因為兩個沒有繼承關係，不能比較
		System.out.println("p instanceof Employee: " + (p instanceof Employee));
//		System.out.println("p instanceof FullTimeEmployee: " + (p instanceof FullTimeEmployee)); // Compile error, 因為兩個沒有繼承關係，不能比較
		System.out.println("p instanceof PartTimeEmployee: " + (p instanceof PartTimeEmployee));
		
	}

}
