package com.will.ch_18;

import java.util.Properties;

public class SystemPropertyTest_18_1 {

	public static void main(String[] args) {
		String userHome = System.getProperty("user.home");
		System.out.println("System.getProperty(\"user.home\"): " + userHome);
		Properties properties = System.getProperties();
		for(Object key: properties.keySet()) {
			System.out.println(key + ": " + properties.getProperty(key.toString()));
		}
	}

}
