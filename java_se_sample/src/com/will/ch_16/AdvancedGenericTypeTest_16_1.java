package com.will.ch_16;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGenericTypeTest_16_1 {

	public static void main(String[] args) {
		List<? extends Number> list1 = new ArrayList<Integer>();
		List<? extends Number> list2 = new ArrayList<Double>();
		List<? extends Number> list3 = new ArrayList<Number>();
		
		// Unable to compile
		//List<Number> list4 = new ArrayList<Integer>();
		
		List<? super Integer> list5 = new ArrayList<Integer>();
		List<? super Integer> list6 = new ArrayList<Number>();
		List<? super Integer> list7 = new ArrayList<Object>();
		
		// Unable to compile
		//List<? super Integer> list8 = new ArrayList<Double>();
	}
		

}