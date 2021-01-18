package com.ritwika.practice;

import java.util.ArrayList;

public class ReplaceEachNodeWithInorderSuccessorAndPredecessor {
	static class Node { 
	    int data; 
	     Node left, right; 
	} 

	static int d;
	   
	// function to get a new node of a binary tree 
	static  Node getNode(int data) 
	{ 
	    // allocate node 
	     Node new_node =new Node(); 
	   
	    // put in the data; 
	    new_node.data = data; 
	    new_node.left = new_node.right = null; 
	   
	    return new_node; 
	}
	public static void main(String[] args) {
		 	Node root = getNode(1);       //         1         
		    root.left = getNode(2);        //       /   \       
		    root.right = getNode(3);       //     2      3      
		    root.left.left = getNode(4);  //    /  \  /   \    
		    root.left.right = getNode(5); //   4   5  6   7    
		    root.right.left = getNode(6); 
		    root.right.right = getNode(7); 
		   
		    System.out.println( "Preorder Traversal before tree modification:"); 
		    preorderTraversal(root); 
		   
		    replaceNodeWithSumUtil(root); 
		   
		    System.out.println("\nPreorder Traversal after tree modification:"); 
		    preorderTraversal(root); 

	}
	private static void replaceNodeWithSumUtil(Node root) {
		ArrayList<Integer> arr=new ArrayList();
		arr.add(0);
		inOrder(arr,root);
		arr.add(0);
		d=1;
		replaceWithSum(arr,root);
	}
	private static void inOrder(ArrayList<Integer> arr, Node root) {
		if(root==null)
			return;
		inOrder(arr,root.left);
		arr.add(root.data);
		inOrder(arr,root.right);
}
	private static void replaceWithSum(ArrayList<Integer> arr, Node root) {
		if(root==null)
			return;
		replaceWithSum(arr,root.left);
		//System.out.println(arr.get(d-1)+" "+arr.get(d+1)); 
		root.data=arr.get(d-1)+arr.get(d+1);
		d++;
		replaceWithSum(arr,root.right);
		
	}
	private static void preorderTraversal(Node root) {
		  // if root is null 
	    if (root==null) 
	        return; 
	   
	    // first print the data of node 
	    System.out.print( root.data + " "); 
	   
	    // then recur on left subtree 
	    preorderTraversal(root.left); 
	   
	    // now recur on right subtree 
	    preorderTraversal(root.right); 
	} 
		


}
