package com.will.practice;
import static com.will.practice.Multiply.*;

public class TestStaticClass {
	
	public static void main(String[] args) {
		System.out.println(doubleMe(1));
	}

}

class Multiply {
	public static int doubleMe(int i) {
		return i * 2;
	}
}



