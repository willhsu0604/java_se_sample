package com.will.ch_6;

public class OverLoading_6_1 {
	
	// 圓形
	public static double calculateArea(double radius) {
		return radius * radius * 3.14;
	}
	
	// 長方形
	public static double calculateArea(double length, double width) {
		return length * width;
	}
	
	public static void main(String[] args) {
		
		double circleArea = calculateArea(2);
		System.out.println("circleArea : " + circleArea);
		double rectangle = calculateArea(2, 4);
		System.out.println("rectangle : " + rectangle);
		
	}

}
