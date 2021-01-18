package com.ritwika.practice;

import java.util.ArrayList;

public class DiameterOfNaryTree {
	static class Node {
		int val;
		ArrayList<Node> children;
		Node(int val) { this.val = val; }
		Node(int val, TreeNode left, TreeNode right) {
	      this.val = val;
	       this.children=new ArrayList<Node>();
	      
	     }     

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int max=Integer.MIN_VALUE;
	public static int findDiameter(Node root) {
		helper(root);
		return max;
	}
	private static int helper(Node root) {
		if(root==null || root.children.size()==0)
			return 0;
		int maxSize=0;
		int secondMaxSize=0;
		for(Node child:root.children) {
			int temp=1+helper(child);
			if(temp>maxSize) {
				secondMaxSize=maxSize;
				maxSize=temp;
			}
			else if(temp>secondMaxSize) {
				secondMaxSize=temp;
			}
		}
		max=Math.max(max,maxSize+ secondMaxSize);
		return maxSize;
	}

}
