package com.will.ch_17;

public class ThreadJoinTest_17_1 {
	
	public static void main(String[] args) {
		Thread t1 = new JoinThread("t1");
		Thread t2 = new JoinThread("t2");
		Thread t3 = new JoinThread("t3");
		
		t1.start();
		try {
			System.out.println("Wait t2 for 2 seconds or t2 is dead");
			t1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			System.out.println("Wait t2 to be dead");
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t3.start();
		
		try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		System.out.println("All threads are dead, exiting main thread");
	}
	
}

class JoinThread extends Thread {
	private String threadName = null;
	public JoinThread(String threadName) {
		this.threadName = threadName;
	} 

	@Override
	public void run() {
		super.run();
		System.out.println(threadName + " is started");
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println(threadName + " is end");
	}
	
}