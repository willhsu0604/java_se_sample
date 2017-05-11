package com.will.ch_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class KeyboardIOTest_15_1 {
	
	public static void main(String[] args) {
		
		System.out.println("BufferedReader: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); 
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("PrintWriter: ");
		PrintWriter out = new PrintWriter(System.out, true); 
		out.println("This is a string");
		int i = -7;
		out.println(i);
		double d = 4.5e-7;
		out.println(d);
		
		System.out.println();
		System.out.println("Scanner: ");
		Scanner s = new Scanner(System.in);
		out.println(s.nextLine());
	}

}
