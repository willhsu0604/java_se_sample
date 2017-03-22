package com.will.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class QueenGame {
	
	private Set<String> queenPositons;
	private Set<String> attckAreas;
	private Set<String> histories;
	
	public QueenGame() {
		queenPositons = new HashSet<>();
		attckAreas = new HashSet<>();
		histories = new HashSet<>();
	}
	
	public void generatePositions() {
		do {
			randomGenQueenDots();
			calculateAllAttckAreas();
			print();
		} while(queenPositons.size() == 0 || conflict());
		System.out.println("Success!");
		print();
	}
	
	private boolean conflict() {
		Iterator<String> attckAreaIt = attckAreas.iterator();
		while(attckAreaIt.hasNext()) {
			String attckArea = attckAreaIt.next();
			Iterator<String> it = queenPositons.iterator();
			while(it.hasNext()) {
				String queenPostion = it.next();
				if(queenPostion.equals(attckArea)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private void randomGenQueenDots() {
		histories.add(generateUniqueStr());
		queenPositons.clear();
		while(queenPositons.size() < 8) {
			int x = (int)(Math.random() * 8);
			int y = (int)(Math.random() * 8);
			queenPositons.add(x + "" + y);
		}
		while(histories.contains(generateUniqueStr())) {
			randomGenQueenDots();
		}
	}
	
	private String generateUniqueStr() {
		String[] array = new String[queenPositons.size()];
		int i = 0;
		for(String queenPosition: queenPositons) {
			array[i] = queenPosition;
			i++;
		}
		Arrays.sort(array);
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < array.length; j ++) {
			sb.append(array[j]);
		}
		return sb.toString();
	}
	
	private void calculateAllAttckAreas() {
		attckAreas.clear();
		for(String queenPosition: queenPositons) {
			int x = Integer.valueOf(queenPosition.split("")[0]);
			int y = Integer.valueOf(queenPosition.split("")[1]);
			for(int i = 0; i < 8; i ++) {
				if(y != i) {
					attckAreas.add(x + "" + i);
				}
				if(x != i) {
					attckAreas.add(i + "" + y);
				}
			}
			
			int tmpX = x - 1;
			int tmpY = y - 1;
			while(tmpX >= 0 && tmpX < 8 && tmpY >= 0 && tmpY < 9) {
				attckAreas.add(tmpX + "" + tmpY);
				tmpX --;
				tmpY --;
			}
			
			tmpX = x + 1;
			tmpY = y + 1;
			while(tmpX >= 0 && tmpX < 8 && tmpY >= 0 && tmpY < 9) {
				attckAreas.add(tmpX + "" + tmpY);
				tmpX ++;
				tmpY ++;
			}
			
			tmpX = x + 1;
			tmpY = y - 1;
			while(tmpX >= 0 && tmpX < 8 && tmpY >= 0 && tmpY < 9) {
				attckAreas.add(tmpX + "" + tmpY);
				tmpX ++;
				tmpY --;
			}
			
			tmpX = x - 1;
			tmpY = y + 1;
			while(tmpX >= 0 && tmpX < 8 && tmpY >= 0 && tmpY < 9) {
				attckAreas.add(tmpX + "" + tmpY);
				tmpX --;
				tmpY ++;
			}
			
		}
	}
	
	public void print() {
		for(int i = 0; i < 8; i ++) {
			for(int j = 0; j < 8; j ++) {
				boolean isQueen = false;
				for(String queenPosition: queenPositons) {
					if(queenPosition.equals(i + "" + j)) {
						isQueen = true;
						break;
					}
				}
				if(isQueen) {
					System.out.print("O");
				} else {
					System.out.print("=");
				}
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		System.out.print("\n");
	}

}
