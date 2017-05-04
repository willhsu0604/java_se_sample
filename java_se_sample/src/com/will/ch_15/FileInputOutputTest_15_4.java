package com.will.ch_15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileInputOutputTest_15_4 {

	public static void main(String[] args) {
		// PrintStream
		File baseDir = new File(System.getProperty("user.dir"));
		File destFile = new File(baseDir, "./resource/printStreamTest.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			if(destFile.exists()) {
				destFile.delete();
			}
			fos = new FileOutputStream(destFile);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			ps.print("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				ps.close();
			}
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

