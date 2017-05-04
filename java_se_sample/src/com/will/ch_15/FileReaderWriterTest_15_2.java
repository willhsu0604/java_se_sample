package com.will.ch_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest_15_2 {

	public static void main(String[] args) {
		File baseDir = new File(System.getProperty("user.dir"));
		File sourceFile = new File(baseDir, "./resource/english.txt");
		File destFile = new File(baseDir, "./resource/english_copy.txt");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		String str = "";
		try {
			if(destFile.exists()) {
				destFile.delete();
			}
			fr = new FileReader(sourceFile);
			br = new BufferedReader(fr);
			fw = new FileWriter(destFile);
			bw = new BufferedWriter(fw);
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
				bw.write(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
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

