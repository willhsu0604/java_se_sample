package com.will.ch_13;

public class WrapperTest_13_1 {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		int intV = i.intValue();
		int intI = Integer.parseInt("1");
		Integer intWrapper = Integer.valueOf("1");
		
		Double d = new Double(1.0);
		int doubleV = i.intValue();
		double doubleD = Double.parseDouble("1.0");
		Integer doubleWrapper = Integer.valueOf("1");
	}

}
