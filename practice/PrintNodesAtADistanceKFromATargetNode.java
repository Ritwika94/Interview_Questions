package com.ritwika.practice;

import com.ritwika.practice.PrintNodesAtADistanceKFromLeafNodes.Node;

public class PrintNodesAtADistanceKFromATargetNode {
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
		PrintNodesAtADistanceKFromATargetNode tree = new PrintNodesAtADistanceKFromATargetNode(); 
   
        /* Let us construct the tree shown in above diagram */
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
			printkdistanceNodeDown(target,k);
			return 0;
		}
		int dl=printkdistanceNode(root.left,target,k);
		if(dl!=-1) {
			if(dl+1==k)
				System.out.println(root.val);
			else
				printkdistanceNodeDown(root.right,k-dl-2);
			return dl+1;
				
		}
		int dr=printkdistanceNode(root.right,target,k);
		if(dr!=-1) {
			if(dr+1==k)
				System.out.println(root.val);
			else
				printkdistanceNodeDown(root.left,k-dr-2);
			return dr+1;
				
		}
		return -1;
		
		
	}
	private void printkdistanceNodeDown(Node root, int k) {
		if(root==null)
			return;
		if(k==0) {
			System.out.println(root.val);
			return;
		}
			
		printkdistanceNodeDown(root.left,k-1);
		printkdistanceNodeDown(root.right,k-1);
		
		
	} 

}
