package com.will.practice.sort;

public class Solution {
	
	public static void main(String[] args) {
		Method method = new Method();
		System.out.println(method.isMatch("aa", "a"));
	}
}

class Method {
	
	public boolean isMatch(String s, String p) {
        if(p.indexOf('.') == -1 && p.indexOf('*') == -1) {
            return s.equals(p);
        } else {
            p = p.replaceAll("\\*", ".*");
            return s.matches(p);
        } 
    }

}