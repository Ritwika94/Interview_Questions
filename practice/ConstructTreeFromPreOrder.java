package com.ritwika.practice;

public class ConstructTreeFromPreOrder {
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
	private Node root;
	private int index;
	public static void main(String[] args) {
			ConstructTreeFromPreOrder tree = new ConstructTreeFromPreOrder(); 
	        int pre[] = new int[]{10, 30, 20, 5, 15}; 
	        char preLN[] = new char[]{'N', 'N', 'L', 'L', 'L'}; 
	        int n = pre.length; 
	        Node mynode = tree.constructTree(pre, preLN, n, tree.root); 
	        System.out.println("Following is Inorder Traversal of the"  
	                                      + "Constructed Binary Tree: "); 
	        tree.printInorder(mynode); 

	}
	private Node constructTree(int[] pre, char[] preLN, int n, Node root) {
		
		int i=0;
		root=constructTreeUtil(pre,preLN);
		return root;
		
	}
	private Node constructTreeUtil(int[] pre, char[] preLN) {
		if(preLN[index]=='L') {
			return new Node(pre[index++]);
			 
		}
		Node root=new Node(pre[index++]);
		//System.out.println();
		root.left=constructTreeUtil(pre,preLN);
		root.right=constructTreeUtil(pre,preLN);
		return root;
		
		
	}
	void printInorder(Node node)  
    { 
        if (node == null) 
            return; 
   
        printInorder(node.left); 
   
        System.out.print(node.data + " "); 
   
        printInorder(node.right); 
    } 

}
