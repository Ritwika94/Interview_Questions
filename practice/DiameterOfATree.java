package com.ritwika.practice;

public class DiameterOfATree {
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
	static class Height 
	{ 
	    int h; 
	} 
	public static void main(String[] args) {
		DiameterOfATree tree = new DiameterOfATree(); 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	        Height ht=new Height();
	        ht.h=0;
	        System.out.println("The diameter of given binary tree is : "
	                           + tree.diameter(root,ht)); 

	}
	
	private int diameter(Node root, Height ht) {
		if(root==null) {
			ht.h=0;
			return 0;
		}
			
		Height lh=new Height() ;
		Height rh=new Height() ;
		int ld=diameter(root.left,lh);
		int rd=diameter(root.right,rh);
		ht.h=Math.max(lh.h, rh.h)+1;
		return Math.max(Math.max(ld, rd),(lh.h+rh.h+1));
		
	}

}
