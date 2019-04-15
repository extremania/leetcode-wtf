package com.github.extermania.leetcode.wtf;

import java.util.Arrays;

public class $0004_Median_of_Two_Sorted_Arrays {
	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    	// O(log(min(m,n))) is sh*t, i only need 4 lines
	        int[] nums = Arrays.copyOf(nums1, nums1.length + nums2.length);
	        System.arraycopy(nums2,0, nums, nums1.length, nums2.length);
	        Arrays.sort(nums);
	        return (nums.length & 1) ==1 ? nums[ nums.length / 2] : (nums[ nums.length / 2 - 1] + nums[ nums.length / 2]) / 2.0;
	    }
	}
}
