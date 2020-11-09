package com.ritwika.practice;

public class PrintAllNodesAtDistanceKFromAGivenNode {
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
	Node root;
	public static void main(String[] args) {
		PrintAllNodesAtDistanceKFromAGivenNode tree = new PrintAllNodesAtDistanceKFromAGivenNode(); 
		   
    
        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(14); 
        Node target = tree.root.left.right; 
        tree.printkdistanceNode(tree.root, target, 2); 

	}
	private int printkdistanceNode(Node root, Node target, int k) {
		if(root==null)
			return -1;
		if(root==target) {
			printkdown(target,k);
			return 0;
		}
		int lh=printkdistanceNode(root.left,target,k);
		if(lh!=-1) {
			if(lh+1==k)
			{
				System.out.print(root.data+" ");
			}
			else
				printkdown(root.right,k-lh-2);
			return 1+lh;
		}
		int rh=printkdistanceNode(root.right,target,k);
		if(rh!=-1) {
			if(rh+1==k)
			{
				System.out.print(root.data+" ");
			}
			else
				printkdown(root.left,k-rh-2);
			return 1+rh;
		}
		return -1;
		
		
	}
	private void printkdown(Node target, int k) {
		if(target==null)
			return ;
		if(k==0) {
			System.out.print(target.data+" ");
			return;
		}
		printkdown(target.left,k-1);
		printkdown(target.right,k-1);
		
	}

}
