package com.will.ch_17;

public class SynchronizationTest_17_2 {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		for(int i = 0; i < 3;  i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						int num = counter.num;
						Thread.sleep(1000);
						System.out.println(num);
						counter.num = num+1;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
		Thread.sleep(4000);
		System.out.println("counter.num: " + counter.num);
	}

}

class Counter {
	public int num = 0;
}
