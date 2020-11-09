package com.ritwika.practice;

import com.ritwika.practice.DiameterOfATree.Node;

public class MaximumDistanceBetweenTwoLeaves {
	static class Node 
	{ 
	    int data; 
	    Node left, right; 
	  
	    public Node(int item) 
	    { 
	        data = item; 
	        left = right = null; 
	    } 
	}
	private static Node root; 
	private static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		MaximumDistanceBetweenTwoLeaves tree = new MaximumDistanceBetweenTwoLeaves(); 
	        tree.root = new Node(-15); 
	        tree.root.left = new Node(5); 
	        tree.root.right = new Node(6); 
	        tree.root.left.left = new Node(-8); 
	        tree.root.left.right = new Node(1); 
	        tree.root.left.left.left = new Node(2); 
	        tree.root.left.left.right = new Node(6); 
	        tree.root.right.left = new Node(3); 
	        tree.root.right.right = new Node(9); 
	        tree.root.right.right.right = new Node(0); 
	        tree.root.right.right.right.left = new Node(4); 
	        tree.root.right.right.right.right = new Node(-1); 
	        tree.root.right.right.right.right.left = new Node(10); 
	        tree.maxPathSum(root); 
	        System.out.println("Maximum Path between two leaves is:"+max);

	}
	private int maxPathSum(Node root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return root.data;
		int ls=maxPathSum(root.left);
		int rs=maxPathSum(root.right);
		if(root.left!=null && root.right!=null) {
			max=Math.max(max, ls+rs+root.data);
			return Math.max(ls,rs)+root.data;
		}
		return (root.left!=null)?ls+root.data:rs+root.data;
	}

}
