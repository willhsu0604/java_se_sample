package com.will.ch_16;

import java.util.LinkedList;
import java.util.Queue;

public class FiFOTest_16_1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		System.out.println("Add 1: " + queue);
		queue.add(2);
		System.out.println("Add 2: " + queue);
		queue.add(3);
		System.out.println("Add 3: " + queue);
		System.out.println("queue.peek(): " + queue.peek() + ", remaining queue: " + queue);
		System.out.println("queue.poll(): " + queue.poll() + ", remaining queue: " + queue);
		queue.add(4);
		System.out.println("Add 4: " + queue);
	}

}
