package com.will.practice;

public class HanoiTest {
	
	
	
	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi(3, 3);
		hanoi.print();
		hanoi.move(0, 1);
		hanoi.print();
		hanoi.move(0, 2);
		hanoi.print();
		hanoi.move(1, 2);
		hanoi.print();
	}

}
