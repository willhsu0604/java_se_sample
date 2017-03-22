package com.will.ch_9;

public class PenOKAgain {
	
	private String brand = "S.K.B";
	private int price = 10;
	
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
		if(price > 0) {
			this.price = price;
		} else {
			System.out.println("您的價錢設定錯誤");
		}
	}

}
