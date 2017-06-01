package com.will.ch_18;

public class InnerClassTest_18_1 {

	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.addCount();
		oc.printCount();
		oc.addCount(10);
		oc.printCount();
		
		// Without Builder 
		Datetime datetime1 = new Datetime(2017, 5, 17, 1, 2, 10);
		System.out.println("datetime1: " + datetime1);
		
		// Builder
		Datetime datetime2 =  new Datetime.Builder(2017, 5, 17)
			.hour(1)
			.minute(2)
			.second(10)
			.create();
		System.out.println("datetime2: " + datetime2);
	}

}
