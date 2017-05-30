package com.will.ch_17;

public class ProducerConsumerTest_17_1 {

	public static void main(String[] args) {
		Store store = new Store();
		Producer p1 = new Producer(store, "p1");
		Producer p2 = new Producer(store, "p2");
		Consumer c1 = new Consumer(store, "c1");
		c1.start();
		p1.start();
		p2.start();
	}

}

class Store {
	public int itemCount = 0;
}

class Producer extends Thread {
	
	private Store store = null;
	private String name;
	
	public Producer(Store store, String name) {
		this.store = store;
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(store) {
				if(store.itemCount >= 5) {
					try {
						System.out.println("商品數量超過五個，生產者 [" + name + "] 進入等待狀態");
						store.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(store.itemCount < 5) {
					store.itemCount++;
					System.out.println("生產者 [" + name + "] 製造一個商品，目前數量: " + store.itemCount);
				}
				store.notify();
				Thread.yield();
			}
		}
	}
	
}

class Consumer extends Thread {
	
	private Store store = null;
	private String name;
	
	public Consumer(Store store, String name) {
		this.store = store;
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(store) {
				if(store.itemCount == 0) {
					try {
						System.out.println("店裡沒商品了，消費者 [" + name + "] 進入等待狀態");
						store.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(store.itemCount > 0) {
					store.itemCount--;
					System.out.println("消費者 [" + name + "] 買了一個商品，目前數量: " + store.itemCount);
				}
				store.notify();
				Thread.yield();
			}
		}
	}
	
}
