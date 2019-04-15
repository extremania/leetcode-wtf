package com.github.extermania.leetcode.wtf;

public class $0065_Valid_Number {
	class Solution {
	    public boolean isNumber(String s) {
	    	// try-catch is a good way
	        try{
	            return Float.parseFloat(s.trim()+"f")==0f || true;
	        }catch(Exception e){
	            return false;
	        }
	    }
	}
}
