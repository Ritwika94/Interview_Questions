package com.ritwika.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumInABinaryTree {
	static class Node  
	{ 
	    int data; 
	    Node left, right; 
	  
	    public Node(int data) 
	    { 
	        this.data = data; 
	        this.left = this.right = null; 
	    } 
	};
	public static void main(String[] args) {
		 Node root = new Node(1); 
		    root.left = new Node(2); 
		    root.right = new Node(3); 
		    root.left.left = new Node(4); 
		    root.left.right = new Node(5); 
		    root.right.right = new Node(8); 
		    root.right.right.left = new Node(6); 
		    root.right.right.right = new Node(7); 
	  
	    System.out.println("Maximum level sum is " + 
	                        maxLevelSum(root)); 

	}
	
	private static int maxLevelSum(Node root) {
		 if (root == null) 
		        return 0; 
		int max=root.data;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			int c=q.size();
			int sum=0;
			while(c-->0) {
				Node temp=q.poll();
				sum=sum+temp.data;
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				
			}
			
			max=Math.max(max, sum);
		}
		return max;
	}
}
