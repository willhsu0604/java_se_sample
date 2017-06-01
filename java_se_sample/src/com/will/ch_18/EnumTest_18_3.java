package com.will.ch_18;

enum WEEK_DAY_ADVANCED {
	MONDAY(1), 
	TUESDAY(2), 
	WEDNESDAY(3), 
	THURSDAY(4), 
	FRIDAY(5), 
	SATURDAY(6), 
	SUNDAY(7);
	
	private int value;
	
	private WEEK_DAY_ADVANCED(int value) {
		this.value = value;
	}
	
	public int value() {
		return this.value;
	}
	
}

public class EnumTest_18_3 {
	
	public static void main(String[] args) {
		WEEK_DAY_ADVANCED[] weekDays = WEEK_DAY_ADVANCED.values();
		for(WEEK_DAY_ADVANCED weekDay: weekDays) {
			System.out.println(weekDay.toString() + "(" + weekDay.value() + ")");
		}
	}

}
