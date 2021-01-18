package com.ritwika.practice;

public class ConstructTreeFromInorderAndLevelOrder {
	class Node { 
	    int data; 
	    Node left, right; 
	  
	    Node(int item) 
	    { 
	        data = item; 
	        left = right = null; 
	    } 
	}

	public static void main(String[] args) {
		ConstructTreeFromInorderAndLevelOrder tree = new ConstructTreeFromInorderAndLevelOrder(); 
	        int in[] = new int[]{4, 8, 10, 12, 14, 20, 22}; 
	        int level[] = new int[]{20, 8, 22, 4, 12, 10, 14}; 
	        int n = in.length; 
	        Node node = tree.buildTree(in, level); 
	   
	        /* Let us test the built tree by printing Inorder traversal */
	        System.out.print("Inorder traversal of the constructed tree is "); 
	        tree.printInorder(node); 

	}
	private void printInorder(Node node) {
		   if (node == null) 
	            return; 
	        printInorder(node.left); 
	        System.out.print(node.data + " "); 
	        printInorder(node.right); 
		
	}
	private Node buildTree(int[] in, int[] level) {
		Node root=buildTreeUtil(in,level,0,in.length-1);
		return root;
	}
	private Node buildTreeUtil(int[] in, int[] level, int start, int end) {
		if(start>end)
			return null;
		
		 if (start == end) 
	            return new Node(in[start]);; 
		Node node=null;
		boolean found=false;
		int index=0;
		for(int i=0;i<level.length;i++) {
			int data=level[i];
			for(int j=start;j<end;j++) {
				 if (data == in[j])  
	                { 
	                    node = new Node(data); 
	                    index = j; 
	                    found = true; 
	                    break; 
	                } 
				 if (found == true) 
		                break; 
			}
		}
		node.left=buildTreeUtil(in,level,start,index-1);
		node.right=buildTreeUtil(in,level,index+1,end);
		return node;
	}
	private int search(int[] in, int data, int start, int end) {
		for(int i=start;i<=end;i++) {
			if(in[i]==data) {
				return i;
			}
		}
		return -1;
	}

}
