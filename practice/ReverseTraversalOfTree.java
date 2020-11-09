package com.ritwika.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ritwika.practice.ZigZagTraversalUsingQueue.Node;

public class ReverseTraversalOfTree {
	 static Node root; 
	static class Node{
		int val;
		Node left;
		Node right;
		public Node(int val) {
			this.val=val;
			left=right=null;
		}
	}
	public static void main(String[] args) {
		ReverseTraversalOfTree tree = new ReverseTraversalOfTree(); 
	     tree.root = new Node(1); 
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4); 
	     tree.root.left.right = new Node(5); 
	     tree.root.right.left = new Node(6); 
	     tree.root.right.right = new Node(7); 
	     reverse(root);
	       

	}
	public static void reverse(Node root) {
		Stack<Integer> stack=new Stack();
		Queue<Node> q=new LinkedList();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			stack.add(temp.val);
			
			if(temp.right!=null) 
			  q.add(temp.right);
			
			if(temp.left!=null) 
				q.add(temp.left);
			
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		
	}
	

}
