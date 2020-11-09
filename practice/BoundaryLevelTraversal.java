package com.ritwika.practice;

import com.ritwika.practice.VerticalOrderTraversalOfTree.Node;

public class BoundaryLevelTraversal {
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
	 public static void main(String args[]) 
	    { 
		 	BoundaryLevelTraversal tree = new BoundaryLevelTraversal(); 
	        tree.root = new Node(20); 
	        tree.root.left = new Node(8); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(12); 
	        tree.root.left.right.left = new Node(10); 
	        tree.root.left.right.right = new Node(14); 
	        tree.root.right = new Node(22); 
	        tree.root.right.right = new Node(25); 
	        tree.printBoundary(tree.root); 
	    }
	private void printBoundary(Node root) {
		if(root==null)
			return;
		System.out.print(root.val+" ");
		printLeftBoundary(root.left);
		printLeaves(root.left);
		printLeaves(root.right);
		printRightBoundary(root.right);
	}
	private void printRightBoundary(Node root) {
		if(root==null)
			return;
		if(root.right!=null) {
			
			printRightBoundary(root.right);
			System.out.print(root.val+" ");
			
		}
		else if(root.left!=null) {
			
			printRightBoundary(root.left);
			System.out.print(root.val+" ");
			
		}
		
	}
	private void printLeaves(Node root) {
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			System.out.print(root.val+" ");
		printLeaves(root.left);
		printLeaves(root.right);
		
	}
	private void printLeftBoundary(Node root) {
		if(root==null)
			return;
		if(root.left!=null) {
			System.out.print(root.val+" ");
			printLeftBoundary(root.left);
			
		}
		else if(root.right!=null) {
			System.out.print(root.val+" ");
			printLeftBoundary(root.right);
			
		}
		
	} 
	
}
