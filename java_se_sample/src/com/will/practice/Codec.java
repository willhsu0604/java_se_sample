package com.will.practice;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    
    private static String HOST_URL = "http://tinyurl.com/";
 
    private static Map<String, String> longUrlMap = new HashMap<String, String>();
    private static Map<String, String> valueMap = new HashMap<String, String>();

    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        if(longUrlMap.containsKey(longUrl)) {
        	return HOST_URL + longUrlMap.get(longUrl);
        } else {
        	int value = longUrlMap.size();
        	longUrlMap.put(longUrl, String.valueOf(value));
        	valueMap.put(String.valueOf(value), longUrl);
        	return HOST_URL + value;
        }
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
    	String value = shortUrl.substring(HOST_URL.length());
    	if(valueMap.containsKey(value)) {
    		return valueMap.get(value);
    	} else {
    		return null;
    	}
        
    }
    
    public static void main(String[] args) {
    	String test = "http://www.html.com";
    	String encoded = encode(test);
    	System.out.println(encoded);
    	String decoded = decode(encoded);
    	System.out.println(decoded);
    }
}