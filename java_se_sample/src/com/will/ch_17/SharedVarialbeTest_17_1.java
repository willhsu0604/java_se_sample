package com.will.ch_17;

public class SharedVarialbeTest_17_1 {
	
	private static boolean isRunning = true;

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while(isRunning) {
					// do nothing
				}
				System.out.println("GoodBye");
			}
			
		}); 
		t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isRunning = false;
	}

}
