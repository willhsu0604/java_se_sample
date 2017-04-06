package com.will.practice.sort;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class Solution {
	
	public static void main(String[] args) {
		
		Method method = new Method();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		int n = method.removeDuplicates(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 7});
		System.out.println(n);
	}
}

class Method {
	
	public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int originalLength = nums.length;
        int sourceIndex = 0;
        int targetIndex = 0;
        while(sourceIndex < originalLength) {
            while(sourceIndex < originalLength && set.contains(nums[sourceIndex])) {
                sourceIndex++;
            }
            if(sourceIndex == originalLength) {
        		break;
        	}
            if(sourceIndex != targetIndex) {
                nums[targetIndex] = nums[sourceIndex];
            }
            if(!set.contains(nums[sourceIndex])) {
               set.add(nums[sourceIndex]);
            }
            targetIndex++;
            sourceIndex++;
        }
        nums = Arrays.copyOfRange(nums, 0, targetIndex);
        return nums.length;
    }
	
}