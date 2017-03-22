package com.will.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MorseCode {
	
	private static Map<String, String> map = new HashMap<>();
	private static KeyValue keyValue = new KeyValue();
	private static String pattern = "----.-";
	
	
	public static void main(String[] args) {
		map.put(".-", "a");
		map.put("-...", "b");
		map.put("-.-.", "c");
		map.put("-..", "d");
		map.put(".", "e");
		map.put("..-.", "f");
		map.put("--.", "g");
		map.put("....", "h");
		map.put("..", "i");
		map.put(".---", "j");
		map.put("-.-", "k");
		map.put(".-..", "l");
		map.put("--", "m");
		map.put("-.", "n");
		map.put("---", "o");
		map.put(".--.", "p");
		map.put("--.-", "q");
		map.put(".-.", "r");
		map.put("...", "s");
		map.put("-", "t");
		map.put("..-", "u");
		map.put("...-", "v");
		map.put(".--", "w");
		map.put("-..-", "x");
		map.put("-.--", "y");
		map.put("--..", "z");
		
		map.put(".----", "1");
		map.put("..---", "2");
		map.put("...--", "3");
		map.put("....-", "4");
		map.put(".....", "5");
		map.put("-....", "6");
		map.put("--...", "7");
		map.put("---..", "8");
		map.put("----.", "9");
		map.put("-----", "0");
		parse(keyValue, pattern);
		print("", keyValue.getKeyValues());
	}
	private static void print(String s, List<KeyValue> keyValues) {
		if(keyValues.size() == 0) {
			StringBuilder sb = new StringBuilder();
			for(char c: s.toCharArray()) {
				Iterator<Entry<String, String>> it = map.entrySet().iterator();
				
				while(it.hasNext()) {
					Entry<String, String> kv = it.next();
					if(String.valueOf(c).equals(kv.getValue())) {
						sb.append(kv.getKey());
					}
				}
			}
			if(sb.toString().equals(pattern)) {
				System.out.println(s);
			}
		} else {
			for(KeyValue kv : keyValues) {
				print(s + kv.getKey(), kv.getKeyValues());
			}
		}
	}
	
	private static void parse(KeyValue keyValue, String s) {
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		List<KeyValue> keyValues = new ArrayList<>();
		keyValue.setKeyValues(keyValues);
		while(it.hasNext()) {
			Entry<String, String> mapKv = it.next();
			if(s.startsWith(mapKv.getKey())) {
				KeyValue kv = new KeyValue();
				kv.setKey(mapKv.getValue());
				keyValues.add(kv);
				parse(kv, s.substring(mapKv.getKey().length()));
			}
		}
	}

}

class KeyValue {
	String key;
	List<KeyValue> keyValues;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<KeyValue> getKeyValues() {
		return keyValues;
	}
	public void setKeyValues(List<KeyValue> keyValues) {
		this.keyValues = keyValues;
	}
}
