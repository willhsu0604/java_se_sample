package com.will.ch_3;

public class RelationalOpVsBitOp {
	
	public static void main(String[] args) {
		boolean a = true || true && false;
		boolean b = true | true & false;
		System.out.println("true || true && false => " + a);
		System.out.println("true | true & false => " + b);
		
		boolean c = true && false || false;
		boolean d = true & false | false;
		System.out.println("true && false || false => " + c);
		System.out.println("true & false | false => " + d);
	}

}
