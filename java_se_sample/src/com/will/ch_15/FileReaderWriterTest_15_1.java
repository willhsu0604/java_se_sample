package com.will.ch_15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest_15_1 {

	public static void main(String[] args) {
		File baseDir = new File(System.getProperty("user.dir"));
		File sourceFile = new File(baseDir, "./resource/english.txt");
		File destFile = new File(baseDir, "./resource/english_copy.txt");
		FileReader fr = null;
		FileWriter fw = null;
		int i = 0;
		try {
			if(destFile.exists()) {
				destFile.delete();
			}
			fr = new FileReader(sourceFile);
			fw = new FileWriter(destFile);
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
				fw.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
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