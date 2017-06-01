package com.will.ch_18;

enum WEEK_DAY {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumTest_18_2 {
	
	public static void main(String[] args) {
		WEEK_DAY[] weekDays = WEEK_DAY.values();
		for(WEEK_DAY weekDay: weekDays) {
			System.out.println(weekDay.toString());
		}
	}

}
