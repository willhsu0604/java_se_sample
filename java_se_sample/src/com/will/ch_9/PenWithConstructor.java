package com.will.ch_9;

public class PenWithConstructor {
	
	private String brand;
	private int price;
	
	public PenWithConstructor(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
