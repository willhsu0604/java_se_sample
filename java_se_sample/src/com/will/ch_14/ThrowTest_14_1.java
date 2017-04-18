package com.will.ch_14;

public class ThrowTest_14_1 {
	
	public static double devide(double devide, double devided) {
		double result;
		if(devided == 0) {
			throw new ArithmeticException("不能除以0啦");
		}
		result = devide/devided;
		return result;
	}

	public static void main(String[] args) {
		try {
			devide(3.0, 0.0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
