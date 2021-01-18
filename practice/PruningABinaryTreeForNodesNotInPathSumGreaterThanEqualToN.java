package com.ritwika.practice;

public class PruningABinaryTreeForNodesNotInPathSumGreaterThanEqualToN {
	static class Node { 
	    int data; 
	    Node left; 
	    Node right; 
	  
	    // Constructor to create a new node 
	    public Node(int data) { 
	        this.data = data; 
	        left = null; 
	        right = null; 
	    } 
	}
	private static Node root;
	public static void main(String[] args) {
		PruningABinaryTreeForNodesNotInPathSumGreaterThanEqualToN tree = new PruningABinaryTreeForNodesNotInPathSumGreaterThanEqualToN(); 
		  
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.root.left.left.left = new Node(8); 
        tree.root.left.left.right = new Node(9); 
        tree.root.left.right.left = new Node(12); 
        tree.root.right.right.left = new Node(10); 
        tree.root.right.right.left.right = new Node(11); 
        tree.root.left.left.right.left = new Node(13); 
        tree.root.left.left.right.right = new Node(14); 
        tree.root.left.left.right.right.left = new Node(15); 
  
        System.out.println("Tree before truncation"); 
        tree.print(tree.root); 
  
        tree.prune(tree.root, 45); 
  
        System.out.println("\nTree after truncation"); 
        tree.print(tree.root); 

	}
	
	private void print(Node root) {
		 // base case 
        if (root == null) 
            return; 
  
        print(root.left); 
        System.out.print(root.data + " "); 
        print(root.right); 
		
	}
	
	private Node prune(Node root, int sum) {
		if(root==null)
			return null;
		root.left=prune(root.left,sum-root.data);
		root.right=prune(root.right,sum-root.data);
		
		if(isLeaf(root)) {
			if(sum>root.data)
				root=null;
		}
		return root;
		
	}

	private boolean isLeaf(Node root) {
		
		return (root.left==null && root.right==null);
	}

}
