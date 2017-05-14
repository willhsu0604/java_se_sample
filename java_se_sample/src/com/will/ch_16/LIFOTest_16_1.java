package com.will.ch_16;

import java.util.Stack;

public class LIFOTest_16_1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack);
		stack.push(1);
		System.out.println("Push 1: " + stack);
		stack.push(2);
		System.out.println("Push 2: " + stack);
		stack.push(3);
		System.out.println("Push 3: " + stack);
		System.out.println("stack.peek(): " + stack.peek() + ", remaining stack: " + stack);
		System.out.println("stack.pop(): " + stack.pop() + ", remaining stack: " + stack);
		stack.push(4);
		System.out.println("Push 4: " + stack);
	}

}
