package com.will.ch_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamFileOutputStreamTest_15_1 {

	public static void main(String[] args) {
		// 每次讀一個byte，直到全部讀取完畢
		File baseDir = new File(System.getProperty("user.dir"));
		File sourceFile = new File(baseDir, "./resource/java.png");
		File destFile = new File(baseDir, "./resource/java_copy.png");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			if(destFile.exists()) {
				destFile.delete();
			}
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destFile);
			int i = 0;
			while((i = fis.read()) != -1) {
				fos.write(i);
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
