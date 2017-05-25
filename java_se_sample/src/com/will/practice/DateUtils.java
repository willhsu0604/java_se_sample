package com.will.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DateUtils {
	public static int[] monthDays = {
			0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	private static Boolean isLeapYear(int year) {
		if(year%4000 == 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public static String addDay(String date, int amount) {
		int year = Integer.valueOf(date.split("-")[0]);
		int month = Integer.valueOf(date.split("-")[1]);
		int day = Integer.valueOf(date.split("-")[2]);
		while(amount > 0) {
			int monthDay = monthDays[month];
			if(isLeapYear(year) && month == 2) {
				monthDay += 1;
			}
			if(amount + day <= monthDay) {
				day = day + amount;
				amount = amount - day;
			} else {
				amount = amount - monthDay + (day - 1);
				day = 1;
				if(month == 12) {
					year = year + 1;
					month = 1;
				} else {
					month = month + 1;
				}
			}
		}
		return String.valueOf(year + "-" + month + "-" + day);
	}

	public static void main(String[] args) {
		int[] a = new int[3];
		List<String> list = new ArrayList<>();
		Iterator<String> it = list.iterator();
		System.out.println(addDay("2016-05-20", 1600));
		LocalDateTime dt1 = LocalDateTime.of(2016, 05, 20, 0, 0, 0);
		System.out.println(dt1.plusDays(1600));
	}

}
