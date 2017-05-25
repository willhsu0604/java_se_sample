package com.will.ch_17;

public class SynchronizationTest_17_1 {
	
	public static void main(String[] args) throws InterruptedException {
		Counter count = new Counter();
		for(int i = 0; i < 3;  i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					int num = count.num;
					try {
						Thread.sleep(1000);
						System.out.println(count.num);
						count.num = num+1; 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
		Thread.sleep(2000);
		System.out.println("count: " + count.num);
	}

}

class Counter {
	public int num = 0;
}
