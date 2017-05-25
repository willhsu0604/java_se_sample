package com.will.ch_17;

public class CounterThread_17_1 extends Thread {
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
		CounterThread_17_1 ct = new CounterThread_17_1();
		System.out.println("Thread is starting...");
		ct.start();
		System.out.println("Thread is started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread");
	}
}
