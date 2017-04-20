package com.will.ch_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamFileOutputStreamTest_15_2 {

	public static void main(String[] args) {
		// 每次讀b變數陣列長度的copy方式
		File baseDir = new File(System.getProperty("user.dir"));
		File sourceFile = new File(baseDir, "./resource/java.png");
		File destFile = new File(baseDir, "./resource/java_copy.png");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int size = 100;
		byte[] b = new byte[size];
		try {
			if(destFile.exists()) {
				destFile.delete();
			}
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destFile);
			while(fis.read(b) != -1) {
				fos.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
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
