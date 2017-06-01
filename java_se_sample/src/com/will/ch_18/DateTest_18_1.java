package com.will.ch_18;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest_18_1 {

	public static void main(String[] args) {
		Date nowDate = new Date();
		Long nowTimestamp = nowDate.getTime();
		System.out.println("now timestamp: " + nowTimestamp);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Date in format [yyyy-MM-dd HH:mm:ss]: " + df.format(nowDate));
		System.out.printf("Date in format [yyyy/MM/dd HH:mm:ss]: %tY/%<tm/%<td %<tT%n", nowDate);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 5, 30);
		System.out.println(cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH));
		
		Locale locale = Locale.TAIWAN;
		df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		TimeZone tz = TimeZone.getTimeZone("Japan");
		System.out.println(tz.getDisplayName(locale));
		System.out.println(df.format(new Date().getTime()));
		
	}

}
