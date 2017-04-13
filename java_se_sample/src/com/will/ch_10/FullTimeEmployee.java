package com.will.ch_10;

public class FullTimeEmployee extends Employee {
	
	private double monthlySalary;

	public FullTimeEmployee(int empno, String ename, double monthlySalary) {
		super(empno, ename);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double getSalary() {
		return monthlySalary;
	}

}
