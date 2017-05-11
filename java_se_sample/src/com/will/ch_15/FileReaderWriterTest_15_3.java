package com.will.ch_15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReaderWriterTest_15_3 {

	public static void main(String[] args) {
		File baseDir = new File(System.getProperty("user.dir"));
		File destFile = new File(baseDir, "./resource/printWriterTest.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			if(destFile.exists()) {
				destFile.delete();
			}
			fw = new FileWriter(destFile);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println("中文");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw != null) {
				pw.close();
			}
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

