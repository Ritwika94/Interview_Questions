package com.ritwika.practice;

import java.util.Stack;

public class PreOrderIterative {
	static class Node { 
		  
	    int data; 
	    Node left, right; 
	  
	    Node(int item) 
	    { 
	        data = item; 
	        left = right = null; 
	    } 
	}
	private static Node root; 
	public static void main(String[] args) {
		PreOrderIterative tree = new PreOrderIterative(); 
	      
	    tree.root = new Node(10); 
	    tree.root.left = new Node(20); 
	    tree.root.right = new Node(30); 
	    tree.root.left.left = new Node(40); 
	    tree.root.left.left.left = new Node(70); 
	    tree.root.left.right = new Node(50); 
	    tree.root.right.left = new Node(60); 
	    tree.root.left.left.right = new Node(80); 
	      
	    tree.preorderIterative(root); 

	}
	private void preorderIterative(Node root) {
		if(root==null)
			return;
		Stack<Node> s=new Stack();
		s.push(root);
		System.out.print("Preorder Traversal:");
		while(!s.isEmpty()) {
			Node temp=s.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null) {
				s.push(temp.right);
				
			}
			if(temp.left!=null) {
				s.push(temp.left);
				
			}
		}
		
		
	}
	

}
