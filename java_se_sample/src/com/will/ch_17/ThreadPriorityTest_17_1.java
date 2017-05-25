package com.will.ch_17;

import java.util.concurrent.atomic.AtomicLong;

public class ThreadPriorityTest_17_1 {
	
	public static AtomicLong[]  priorityCount = {
			new AtomicLong(0), new AtomicLong(0), new AtomicLong(0)
	};
	
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 500; i++){
					new PriorityThread(Thread.MAX_PRIORITY).start();
					new PriorityThread(Thread.NORM_PRIORITY).start();
					new PriorityThread(Thread.MIN_PRIORITY).start();
				}
			}
			
		}).start();
		
		try {
			Thread.sleep(1002);
			System.out.println("Max priority count: " + priorityCount[2] + ", Normal priority count: " + priorityCount[1] + ", Min priority count: " + priorityCount[0]);
			System.exit(0);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
}

class PriorityThread extends Thread {
	
	private int priority;
	public PriorityThread(int prioirty) {
		this.priority = prioirty;
		this.setPriority(prioirty);
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread.yield();
			ThreadPriorityTest_17_1.priorityCount[priority/5].getAndIncrement();
		}
	}
	
}
