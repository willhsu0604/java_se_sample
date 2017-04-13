package com.will.ch_12;

import static java.lang.Math.*;

public class TestStaticImport_12_1 {

	public static void main(String[] args) {
		double r = sin(PI * 2); //等於 r = Math.sin(PI * 2);
		r = Math.sin(PI * 2);
	}

}
