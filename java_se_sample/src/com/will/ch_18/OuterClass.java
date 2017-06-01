package com.will.ch_18;

public class OuterClass {
	
	private int count = 0;
	
	public void printCount() {
		System.out.println("count: " + count);
	}
	
	public void addCount(int value) {
		
		class InnerMethodClass {
			
			public void addCount() {
				// value+=1;
				count += value;
			}
			
		}
		
		InnerMethodClass imc = new InnerMethodClass();
		imc.addCount();
	}
	
	public class InnerClass {
		
		public void addCount() {
			count++;
		}
		
	}

}
