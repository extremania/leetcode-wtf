package com.github.extermania.leetcode.wtf;

public class $0326_Power_of_Three {
	class Solution {
	    public boolean isPowerOfThree(int n) {
	        return n>0 && 1162261467%n==0; //n^20 is overflow
	    }
	}
}
