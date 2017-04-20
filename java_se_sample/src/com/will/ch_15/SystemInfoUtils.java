package com.will.ch_15;

public class SystemInfoUtils {
	
	public static boolean isWindows() {
		return System.getProperty("os.name").startsWith("Windows");
	}
	
	public static boolean isMac() {
		return System.getProperty("os.name").startsWith("Mac");
	}

}
