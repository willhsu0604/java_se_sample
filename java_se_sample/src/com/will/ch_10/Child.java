package com.will.ch_10;

public class Child extends Parent {
	
	public int getHeritage() {
		return super.getHeritage();
	}
	
	/*
	 * Compile error, child開放的權限不能比parent還要小
	 *
	private int getHeritage() {
		return super.getHeritage();
	}
	*/

}
