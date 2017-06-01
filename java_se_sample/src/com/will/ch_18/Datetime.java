package com.will.ch_18;

public class Datetime {
	
	private int year;
	private int month;
	private int date;
	private int hour;
	private int minute;
	private int second;
	
	@Override
	public String toString() {
		return year + "-" + month + "-" + date + " " + hour + ":" + minute + ":" + second;
	}
	
	public Datetime(int year, int month, int date, int hour, int minute, int second) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public static class Builder {
		private int nestedYear;
		private int nestedMonth;
		private int nestedDate;
		private int nestedHour;
		private int nestedMinute;
		private int nestedSecond;
		
		public Builder(final int year, final int month, final int date) {
			this.nestedYear = year;
			this.nestedMonth = month;
			this.nestedDate = date;
		}
		
		public Builder hour(int hour) {
			this.nestedHour = hour;
			return this;
		}
		
		public Builder minute(int minute) {
			this.nestedMinute = minute;
			return this;
		}
		
		public Builder second(int second) {
			this.nestedSecond = second;
			return this;
		}
		
		public Datetime create() {
			return new Datetime(
				nestedYear,
				nestedMonth,
				nestedDate,
				nestedHour,
				nestedMinute,
				nestedSecond);
			
		}
		
	}

}
