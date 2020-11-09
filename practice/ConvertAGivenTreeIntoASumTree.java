package com.ritwika.practice;

public class ConvertAGivenTreeIntoASumTree {
	static class Node  
	{ 
	    int data; 
	    Node left, right; 
	   
	    Node(int item)  
	    { 
	        data = item; 
	        left = right = null; 
	    } 
	}


	private Node root; 
	   

	public static void main(String[] args) {
		ConvertAGivenTreeIntoASumTree tree = new ConvertAGivenTreeIntoASumTree(); 
		   
        /* Constructing tree given in the above figure */
        tree.root = new Node(10); 
        tree.root.left = new Node(-2); 
        tree.root.right = new Node(6); 
        tree.root.left.left = new Node(8); 
        tree.root.left.right = new Node(-4); 
        tree.root.right.left = new Node(7); 
        tree.root.right.right = new Node(5); 
   
        tree.toSumTree(tree.root); 
   
        
        System.out.println("Inorder Traversal of the resultant tree is:"); 
        tree.printInorder(tree.root); 

	}


	private int toSumTree(Node root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null) {
			int val=root.data;
			root.data=0;
			return val;
		}
		int ls=toSumTree(root.left);
		int rs=toSumTree(root.right);
		int x=root.data+ls+rs;
		root.data=ls+rs;
		
		return x;
		
	}


	private void printInorder(Node node) {

        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(node.data + " "); 
        printInorder(node.right); 
		
	}

}
