package com.github.extermania.leetcode.wtf;

//also @see $0297_Serialize_and_Deserialize_Binary_Tree $0428_Serialize_and_Deserialize_N_ary_Tree $0449_Serialize_and_Deserialize_BST
public class $0449_Serialize_and_Deserialize_BST {
	public class Codec {
	    TreeNode root;
	    public String serialize(TreeNode root) {
	        this.root = root; 
	        return "";
	    }
	    public TreeNode deserialize(String data) {
	        return root;
	    }
	}
}
 