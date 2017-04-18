package com.will.ch_11;

public class Truck extends Car {
	
	private int goodsAmount;

	public int getGoodsAmount() {
		return goodsAmount;
	}

	public void setGoodsAmount(int goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	
	public double getFuelAmountEveryKM() {
		return 0.3;
	}

}
