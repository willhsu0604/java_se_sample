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
		int n = method.searchInsert(new int[]{1,3}, 2);
		System.out.println(n);
	}
}

class Method {
	
	public int searchInsert(int[] nums, int target) {
        if(nums.length == 0 || nums[0] > target) return 0;
		if(nums[nums.length - 1] < target) return nums.length;
		
		int low = 0, high = nums.length - 1;
        while(low < high && low < nums.length-1 && high > 0) {
            int middle = (high + low)/2;
            if(high == low + 1 && nums[high] > target && nums[low] < target) {
            	low = middle+1;
            	break;
            } else if(nums[middle] == target) {
                low = middle;
                break;
            } else if (nums[middle] > target) {
                high = middle;
            } else {
                low = middle+1;
            }
        }
        return low;
    }
	
}