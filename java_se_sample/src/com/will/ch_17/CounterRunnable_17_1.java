package com.will.ch_17;

public class CounterRunnable_17_1 implements Runnable {
	int count = 10;
	public void run() {
		while(count > 0) {
			System.out.println(count);
			count--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Thread t = new Thread(new CounterRunnable_17_1());
		System.out.println("Thread is starting...");
		t.start();
		System.out.println("Thread is started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread");
	}
}
