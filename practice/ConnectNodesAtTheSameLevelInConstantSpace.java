package com.ritwika.practice;

public class ConnectNodesAtTheSameLevelInConstantSpace {
	static class Node  
	{ 
	    int data; 
	    Node left, right, nextRight; 
	   
	    Node(int item)  
	    { 
	        data = item; 
	        left = right = nextRight = null; 
	    } 
	}
	private Node root;
	public static void main(String[] args) {
		ConnectNodesAtTheSameLevelInConstantSpace tree = new ConnectNodesAtTheSameLevelInConstantSpace(); 
	        tree.root = new Node(10); 
	        tree.root.left = new Node(8); 
	        tree.root.right = new Node(2); 
	        tree.root.left.left = new Node(3); 
	        tree.root.right.right = new Node(90); 
	   
	        // Populates nextRight pointer in all nodes 
	        tree.connect(tree.root); 
	           
	        // Let us check the values of nextRight pointers 
	        int a = tree.root.nextRight != null ?  
	                                     tree.root.nextRight.data : -1; 
	        int b = tree.root.left.nextRight != null ?  
	                                 tree.root.left.nextRight.data : -1; 
	        int c = tree.root.right.nextRight != null ?  
	                                tree.root.right.nextRight.data : -1; 
	        int d = tree.root.left.left.nextRight != null ?  
	                                  tree.root.left.left.nextRight.data : -1; 
	        int e = tree.root.right.right.nextRight != null ?  
	                                   tree.root.right.right.nextRight.data : -1; 
	           
	        // Now lets print the values 
	        System.out.println("Following are populated nextRight pointers in "
	                + " the tree(-1 is printed if there is no nextRight)"); 
	        System.out.println("nextRight of " + tree.root.data + " is " + a); 
	        System.out.println("nextRight of " + tree.root.left.data  
	                                                       + " is " + b); 
	        System.out.println("nextRight of " + tree.root.right.data +  
	                                                           " is " + c); 
	        System.out.println("nextRight of " + tree.root.left.left.data +  
	                                                            " is " + d); 
	        System.out.println("nextRight of " + tree.root.right.right.data +  
	                                                             " is " + e); 
	 
	}
	private void connect(Node p) {
		Node q=null;
		if(p==null)
			return;
		p.nextRight=null;
		while(p!=null) {
			q=p;
			while(q!=null) {
				if(q.left!=null) {
					if(q.right!=null)
						q.left.nextRight=q.right;
					else
						q.left.nextRight=getNextRight(q);
				}
				if(q.right!=null)
					q.right.nextRight=getNextRight(q);
				q=q.nextRight;
			}
			if(p.left!=null)
				p=p.left;
			else if(p.right!=null)
				p=p.right;
			else
				p=getNextRight(p);
		}
		
	}
	private Node getNextRight(Node q) {
		Node temp=q.nextRight;
		while(temp!=null) {
			if(temp.left!=null)
				return temp.left;
			if(temp.right!=null)
				return temp.right;
			temp=temp.nextRight;
		}
		return null;
	} 
	  


}
