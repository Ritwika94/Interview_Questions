package com.ritwika.practice;

public class CheckIfOneTreeIsASubTreeOfAnother {
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

	private Node root1;
	private Node root2; 
	boolean flag=false;
	public static void main(String[] args) {
		CheckIfOneTreeIsASubTreeOfAnother tree = new CheckIfOneTreeIsASubTreeOfAnother(); 
          	tree.root1 = new Node(26); 
	        tree.root1.right = new Node(3); 
	        tree.root1.right.right = new Node(3); 
	        tree.root1.left = new Node(10); 
	        tree.root1.left.left = new Node(4); 
	        tree.root1.left.left.right = new Node(30); 
	        tree.root1.left.right = new Node(6); 
	
	        tree.root2 = new Node(10); 
	        tree.root2.right = new Node(6); 
	        //tree.root2.right.right= new Node(4); 
	        tree.root2.left = new Node(4); 
	        tree.root2.left.right = new Node(30); 
	        boolean p=tree.isSubtree(tree.root1, tree.root2);
	       // System.out.println(p);
	        if (p) 
	            System.out.println("Tree 2 is subtree of Tree 1 "); 
	        else
	            System.out.println("Tree 2 is not a subtree of Tree 1"); 
	        tree.root1 = new Node(10); 
	        tree.root1.right = new Node(3); 
	        tree.root1.right.right = new Node(4); 
	        tree.root1.left=new Node(3);
	        tree.root1.left.right = new Node(41); 
	        tree.root2 = new Node(3); 
	        tree.root2.right = new Node(4); 
	      
		        if (tree.isSubtree(tree.root1, tree.root2)) 
		            System.out.println("Tree 2 is subtree of Tree 1 "); 
		        else
		            System.out.println("Tree 2 is not a subtree of Tree 1"); 
	    
	}

	private boolean isSubtree(Node root1, Node root2) {
		if(root1==null)
			return true;
		if(root1.data==root2.data) {
			flag=true;
			boolean x=checkTree(root1,root2);
			if(x==false)
				flag=false;
			return x;
			
		}
		
		boolean p= isSubtree(root1.left,root2);
		if(flag)
			return p;
		boolean q=isSubtree(root1.right,root2);
		if(flag)
			return q;
		return false;
		
	}

	private boolean checkTree(Node root1, Node root2) {
		if(root1==null && root2==null)
			return true;
		if(root1!=null && root2!=null && root1.data==root2.data) {
			//System.out.println( checkTree(root1.left,root2.left) && checkTree(root1.right,root2.right));
			return checkTree(root1.left,root2.left) && checkTree(root1.right,root2.right);
		}
		
		return false;
	} 


}
