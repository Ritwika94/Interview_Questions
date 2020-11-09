package com.ritwika.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class ZigZagTraversalUsingQueue {
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
		ZigZagTraversalUsingQueue tree = new ZigZagTraversalUsingQueue(); 
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
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		boolean itr=false;
		while(!q.isEmpty()) {
			ArrayList<Integer> alist=new ArrayList();
			 int size = q.size();
			for(int i=0;i<size;i++) {
				Node temp=q.poll();
				if(itr)
				{
					alist.add(temp.val);
				}
				else
					alist.add(0,temp.val);
				if(temp.left!=null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}
			for(int val:alist)
				System.out.print(val+" ");
			itr=!itr;
			
		}
		
		

	}
	

}
