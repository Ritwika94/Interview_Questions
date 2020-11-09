package com.ritwika.practice;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtTheSameLevel {
	static class Node { 
	    int data; 
	    Node left, right, nextRight; 
	  
	    Node(int item) 
	    { 
	        data = item; 
	        left = right = nextRight = null; 
	    } 
	} 
	  
	 private Node root;

	public static void main(String args[]) 
	    { 
		 ConnectNodesAtTheSameLevel tree = new ConnectNodesAtTheSameLevel(); 
	
	        tree.root = new Node(10); 
	        tree.root.left = new Node(8); 
	        tree.root.right = new Node(2); 
	        tree.root.left.left = new Node(3); 
	        tree.connect(tree.root); 
		    System.out.println("Following are populated nextRight pointers in "
	                           + "the tree"
	                           + "(-1 is printed if there is no nextRight)"); 
	        int a = tree.root.nextRight != null ? tree.root.nextRight.data : -1; 
	        System.out.println("nextRight of " + tree.root.data + " is "
	                           + a); 
	        int b = tree.root.left.nextRight != null ? tree.root.left.nextRight.data : -1; 
	        System.out.println("nextRight of " + tree.root.left.data + " is "
	                           + b); 
	        int c = tree.root.right.nextRight != null ? tree.root.right.nextRight.data : -1; 
	        System.out.println("nextRight of " + tree.root.right.data + " is "
	                           + c); 
	        int d = tree.root.left.left.nextRight != null ? tree.root.left.left.nextRight.data : -1; 
	        System.out.println("nextRight of " + tree.root.left.left.data + " is "
	                           + d); 
	    }

	private void connect(Node root) {
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			
			while(q.peek()!=null) {
			Node temp=q.remove();
			Node nextNode=q.peek();
			if(nextNode!=null) {
				temp.nextRight=nextNode;
			}
			else {
				temp.nextRight=new Node(-1);
			}
		
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			}
			q.remove();
			if(!q.isEmpty())
				q.add(null);
			
		}
		
		
	} 
	} 

