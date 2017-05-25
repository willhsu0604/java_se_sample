package com.will.ch_17;

public class ThreadYieldTest_17_1 {
	
	public static void main(String[] args) {
		Thread t1 = new YieldThread("t1");
		Thread t2 = new YieldThread("t2");
		t1.start();
		t2.start();
	}
	
}

class YieldThread extends Thread {
	private String threadName = null;
	public YieldThread(String threadName) {
		this.threadName = threadName;
	} 

	@Override
	public void run() {
		super.run();
		System.out.println(threadName + " is started");
		for(int i = 0; i < 10; i++) {
			System.out.println(threadName + " current index : " + i);
			if(i == 5) {
				Thread.yield();
			}
		}
		System.out.println(threadName + " is end");
	}
	
}