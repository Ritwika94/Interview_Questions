package com.ritwika.practice;

public class ModifyBinaryTreeToGetPreOrderUsingRightPointer {
	static class Node  
	{  
	    int data;  
	    Node left;  
	    Node right;  
	};
	public static void main(String[] args) {
		Node root = newNode(10);  
	    root.left = newNode(8);  
	    root.right = newNode(2);  
	    root.left.left = newNode(3);  
	    root.left.right = newNode(5);  
	  
	    modifytree(root);  
	    printpre(root);

	}
	static Node newNode(int data)  
	{  
	    Node node = new Node();  
	    node.data = data;  
	    node.left = null;  
	    node.right = null;  
	    return (node);  
	} 
	static void printpre( Node root)  
	{  
	    while (root != null)  
	    {  
	        System.out.print( root.data + " ");  
	        root = root.right;  
	    }  
	}  
	static Node modifytree( Node root) {
		Node right=root.right;
		Node rightMost=root;
		if(root.left!=null) {
			rightMost=modifytree(root.left);
			root.right=root.left;
			root.left=null;
		}
		if(right==null)
			return rightMost;
		rightMost.right=right;
		rightMost=modifytree(right);
		return rightMost;
	}

}
