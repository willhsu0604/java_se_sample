package com.will.ch_9;

public class StaticCountTest_9_1 {
	
	public static void main(String[] args) {
		
		System.out.println("初始數量: " + Count.getTotalCount());
		Count count1 = new Count();
		System.out.println("累積數量: " + Count.getTotalCount());
		System.out.println("序號: " + count1.getSerialNumber());
		
		Count count2 = new Count();
		System.out.println("累積數量: " + Count.getTotalCount());
		System.out.println("序號: " + count2.getSerialNumber());
		
	}

}
