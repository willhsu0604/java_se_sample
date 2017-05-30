package com.will.ch_17;

public class WaitNotifyTest_17_1 {

	static Object obj = new Object();

	public static void main(String[] args) {
		WaitNotifyThread t1 = new WaitNotifyThread();
		t1.start();
		int count = 0;
		while (count < 5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj) {
				System.out.println("Main thread call notify");
				obj.notify();
				count++;
			}
		}

	}

}

class WaitNotifyThread extends Thread {

	private int count;

	@Override
	public void run() {
		super.run();
		while (count < 5) {
			count++;
			System.out.println("waitThread has count [" + count + "]");
			synchronized (WaitNotifyTest_17_1.obj) {
				try {
					System.out.println("waitThread call wait");
					WaitNotifyTest_17_1.obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
