package com.will.ch_11;

public class TruckFuelMachine extends CarFuelMachine {
	
	private int goodsAmount;

	public int getGoodsAmount() {
		return goodsAmount;
	}

	public void setGoodsAmount(int goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	
	@Override
	public double getFuelAmountEveryKM() {
		return 0.3;
	}

}
