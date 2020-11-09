package com.ritwika.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ZigZagTraversalUsing2Stacks {
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
		ZigZagTraversalUsing2Stacks tree = new ZigZagTraversalUsing2Stacks(); 
	     tree.root = new Node(1); 
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4); 
	     tree.root.left.right = new Node(5); 
	     tree.root.right.left = new Node(6); 
	     tree.root.right.right = new Node(7); 
	     zigzag(root);
	       

	}
	public static void zigzag(Node root) {
		Stack<Node> currentStack=new Stack();
		Stack<Node> newStack=new Stack();
		currentStack.push(root);
		boolean itr=false;
		while(!currentStack.isEmpty()) {
			Node temp=currentStack.peek();
			System.out.print(currentStack.pop().val+" ");
			if(itr) {
				if(temp.left!=null) {
					newStack.push(temp.left);
					
				}
				if(temp.right!=null) {
					newStack.push(temp.right);
					
				}
			}
			if(!itr) {
				if(temp.right!=null) {
					newStack.push(temp.right);
					
				}
				if(temp.left!=null) {
					newStack.push(temp.left);
					
				}
			}
			if(currentStack.isEmpty()) {
				itr=!itr;
				Stack temp1=currentStack;
				currentStack=newStack;
				newStack=temp1;
			}
			
			
		}
		
	}
	

}
