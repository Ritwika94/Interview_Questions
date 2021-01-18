package com.ritwika.practice;

import java.util.Vector;

public class PrintAllKSumPathsInABinaryTree {
	static class Node  
	{  
	    int data;  
	    Node left,right;  
	    Node(int x)  
	    {  
	        data = x;  
	        left = right = null;  
	    }  
	};  
	static Vector<Integer> path = new Vector<Integer>(); 
	public static void main(String[] args) {
		Node root = new Node(1);  
	    root.left = new Node(3);  
	    root.left.left = new Node(2);  
	    root.left.right = new Node(1);  
	    root.left.right.left = new Node(1);  
	    root.right = new Node(-1);  
	    root.right.left = new Node(4);  
	    root.right.left.left = new Node(1);  
	    root.right.left.right = new Node(2);  
	    root.right.right = new Node(5);  
	    root.right.right.right = new Node(2);  
	  
	    int k = 5;  
	    printKPath(root, k); 

	}
	private static void printKPath(Node root, int k) {
		if(root==null)
			return;
		path.add(root.data);
		printKPath(root.left,k);
		printKPath(root.right,k);
		int sum=0;
		for(int i=path.size()-1;i>=0;i--) {
			sum+=path.get(i);
			if(sum==k)
				printnodes(path,i);
		}
		
		path.remove(path.size()-1);
	}
	private static void printnodes(Vector<Integer> path, int index) {
		for(int i=index;i<=path.size()-1;i++) {
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}
	  

}
