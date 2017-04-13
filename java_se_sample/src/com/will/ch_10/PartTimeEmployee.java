package com.will.ch_10;

public class PartTimeEmployee extends Employee {
	
	private double hourlySalary;
	private double hours;

	public PartTimeEmployee(int empno, String ename, double hourlySalary) {
		super(empno, ename);
		this.hourlySalary = hourlySalary;
	}
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public double getSalary() {
		return hourlySalary*hours;
	}

}
