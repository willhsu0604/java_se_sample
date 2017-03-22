package com.will.ch_9;

public class StaticCountTest_9_2 {
	
	public static void main(String[] args) {
		
		CountWithStatic count1 = new CountWithStatic();
		System.out.println("累積數量: " + CountWithStatic.getTotalCount());
		System.out.println("序號: " + count1.getSerialNumber());
		
		CountWithStatic count2 = new CountWithStatic();
		System.out.println("累積數量: " + CountWithStatic.getTotalCount());
		System.out.println("序號: " + count2.getSerialNumber());
		
	}

}
