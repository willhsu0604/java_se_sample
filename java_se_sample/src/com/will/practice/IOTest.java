package com.will.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IOTest {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("/tmp/score.csv")));
			String line = null;
			List<String> list = new ArrayList<>();
			String header = "";
			boolean isFirst = true;
			while((line = br.readLine()) != null) {
				if(isFirst) {
					header = line;
					isFirst = false;
				} else {
					list.add(line);
				}
			}
			list.sort(new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					int score1 = Integer.valueOf(o1.split(",")[2].trim());
					int score2 = Integer.valueOf(o2.split(",")[2].trim());
					return score1 - score2;
				}
			});
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/tmp/score_order.csv")));
			bw.write(header + System.lineSeparator());
			for(String str: list) {
				bw.write(str + System.lineSeparator());
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
