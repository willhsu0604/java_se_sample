package com.will.ch_7;

public class Pen {
	
	String brand;
	int price;
	String color;
	
	public void write(String sentence) {
		System.out.println("Write: \"" + sentence + "\" with brand " + brand);
	}
	
	public void showInformation() {
		System.out.println("brand: " + brand);
		System.out.println("price: " + price);
		System.out.println("color: " + color);
	}
	

}
