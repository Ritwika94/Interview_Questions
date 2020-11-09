package com.ritwika.practice;

import com.ritwika.practice.ReverseTraversalOfTree.Node;

public class PrintNodesAtADistanceKFromLeafNodes {
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
			PrintNodesAtADistanceKFromLeafNodes tree = new PrintNodesAtADistanceKFromLeafNodes(); 
		     tree.root = new Node(1); 
		     tree.root.left = new Node(2); 
		     tree.root.right = new Node(3); 
		     tree.root.left.left = new Node(4); 
		     tree.root.left.right = new Node(5); 
		     tree.root.right.left = new Node(6); 
		     tree.root.right.right = new Node(7); 
		     tree.root.right.left.right=new Node(8);
		     int k=2;
		    printNodes(root,k);
		       

		}
		private static int printNodes(Node root, int k) {
			if(root==null)
				return -1;
			int lh=printNodes(root.left,k);
			int rh=printNodes(root.right,k);
			
			boolean isleaf=(lh==-1 && rh==-1);
			if(lh==0 || rh==0 ||(isleaf && k==0))
				System.out.println(root.val);
			if(isleaf && k>0)
				return k-1;
			if(lh>0 && lh<k)
				return lh-1;
			if(rh>0 && rh<k)
				return rh-1;
			
			return -2;
			
			
			
		}

}
