package com.ritwika.practice;

import java.util.Stack;

import com.ritwika.practice.PreOrderIterative.Node;

public class PostOrderIterative {
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
	private static void postOrderIterative(node root) {
		Stack<node> s1=new Stack();
		Stack<node> s2=new Stack();
		s1.push(root);
		while(!s1.isEmpty()) {
			node temp=s1.pop();
			s2.push(temp);
			if(temp.left!=null)
				s1.push(temp.left);
			if(temp.right!=null)
				s1.push(temp.right);
			
		}
		System.out.print("PostOrder Traversal:");
		while(!s2.isEmpty()) {
			System.out.print(s2.pop().data+" ");
		}
		
	}

}
