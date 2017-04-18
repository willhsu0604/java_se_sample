package com.will.ch_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CloseableResourceTest_14_1 {
	
	public static void main(String[] args) {
		// Before
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("EMPTY_FILE_PATH"));
			String s = "";
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// After Javaw 7, try with resources會確保資源在最後都會被關閉
		try {
			br = new BufferedReader(new FileReader("EMPTY_FILE_PATH"));
			String s = "";
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
