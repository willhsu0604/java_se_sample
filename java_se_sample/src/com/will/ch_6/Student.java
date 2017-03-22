package com.will.ch_6;

public class Student {
	
	public int score = 0;

	public void play(int hours) {
		score -= hours;
	}
	
	public void study(int hours) {
		score += hours;
	}

}
