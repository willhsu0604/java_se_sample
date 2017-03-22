package com.will.ch_9;

public class PenOverloading {
	
	private String brand;
	private int price;
	
	public PenOverloading(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public PenOverloading(String brand) {
		this(brand, 10);
	}
	
	public PenOverloading(int price) {
		this("S.K.B", price);
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
