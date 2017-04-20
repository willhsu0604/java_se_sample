package com.will.ch_15;

import java.io.File;
import java.io.IOException;

public class FileTest_15_1 {

	public static void main(String[] args) {
		// Windows與Mac路徑表示方式不同
		String folderPath = SystemInfoUtils.isWindows() ? "C:/myDir" : "/tmp/myDir";
		File myDir = new File(folderPath);
		
		System.out.println("myDir.getAbsolutePath(): " + myDir.getAbsolutePath());
		System.out.println("myDir.getName(): " + myDir.getName());
		System.out.println("myDir.getParent(): " + myDir.getParent());
		System.out.println("myDir.exists(): " + myDir.exists());
		
		// 若資料夾不存在，建立一個資料夾
		if(!myDir.exists()) {
			System.out.println("建立資料夾，路徑: " + myDir.getPath());
			myDir.mkdir();
		}
		
		File myFile = new File(myDir, "myFile.txt");
		try {
			if(!myFile.exists()) {
				System.out.println("建立檔案，路徑: " + myFile.getPath());
				myFile.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(myFile.exists()) {
			System.out.println("刪除檔案，路徑: " + myFile.getPath());
			myFile.delete();
		}
		
		if(myDir.exists()) {
			System.out.println("刪除資料夾，路徑: " + myDir.getPath());
			myDir.delete();
		}
	}

}
