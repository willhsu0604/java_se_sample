package com.will.ch_17;

public class SynchronizationTest_17_1 {
	
	private static boolean lock = false;
	
	public static void main(String[] args) throws InterruptedException {
		LockCounter counter = new LockCounter();
		for(int i = 0; i < 3;  i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						while(lock) {
							Thread.sleep(10);
						}
						lock = true;
						int num = counter.num;
						Thread.sleep(1000);
						System.out.println(num);
						counter.num = num+1;
						lock = false;
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

class LockCounter {
	public int num = 0;
}
