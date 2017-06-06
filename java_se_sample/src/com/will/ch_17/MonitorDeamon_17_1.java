package com.will.ch_17;

import java.util.concurrent.atomic.AtomicInteger;

public class MonitorDeamon_17_1 {
	
	private static AtomicInteger onlineUserAmount = new AtomicInteger(0);

	public static void main(String[] args) {
		
		System.out.println("Server started");
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					System.out.println("Current online user amount: " + onlineUserAmount.get());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		t.setDaemon(true);
		t.start();
		
		int MAX_AMOUNT = 10;
		int count = 0;
		while(count < MAX_AMOUNT) {
			int randonAmount = (int)(Math.random() * 100);
			onlineUserAmount.set(randonAmount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
		}

	}

}
