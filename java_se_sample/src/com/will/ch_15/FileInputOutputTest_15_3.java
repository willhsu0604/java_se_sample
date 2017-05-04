package com.will.ch_15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTest_15_3 {

	public static void main(String[] args) {
		// 使用BufferStream 讓它幫你管理減少寫入寫出次數
		File baseDir = new File(System.getProperty("user.dir"));
		File sourceFile = new File(baseDir, "./resource/java.png");
		File destFile = new File(baseDir, "./resource/java_copy.png");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			if(destFile.exists()) {
				destFile.delete();
			}
			fis = new FileInputStream(sourceFile);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(destFile);
			bos = new BufferedOutputStream(fos);
			int size =  bis.available();
			byte[] b = new byte[size];
			while(bis.read(b) != -1) {
				bos.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
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

