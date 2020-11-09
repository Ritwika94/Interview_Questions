package com.ritwika.practice;

import com.ritwika.practice.PostOrderIterative.node;

public class PostIterativeUsingOneStack {
	static class node { 
		  
	    int data; 
	    node left, right; 
	  
	    node(int item) 
	    { 
	        data = item; 
	        left = right = null; 
	    } 
	}
	private static node root; 
	public static void main(String[] args) {
		 node root = null; 
	        root = new node(1); 
	        root.left = new node(2); 
	        root.right = new node(3); 
	        root.left.left = new node(4); 
	        root.left.right = new node(5); 
	        root.right.left = new node(6); 
	        root.right.right = new node(7); 
	  
	        postOrderIterative(root); 

	}
	private static void postOrderIterative(node root2) {
		// TODO Auto-generated method stub
		
	}

}
