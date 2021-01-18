package com.ritwika.practice;

import java.util.HashMap;

import com.ritwika.practice.CloneALinkedListWithRandomPointers.Node;

public class CloneBinaryTreeWithRandomPointers {
	HashMap<Node,Node> hmap=new HashMap();
	static class Node  
	{  
	    int data;  
	    Node left,right,random;  
	    Node(int x)  
	    {  
	        data = x;  
	        left = right=random = null;  
	    }  
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node cloneNode(Node root) {
		if(root==null)
			return root;
		return dfs(root);
	}
	private Node dfs(Node root) {
		if(root==null)
			return root;
		if(hmap.get(root)!=null)
			return hmap.get(root);
		Node node=new Node(root.data);
		hmap.put(root, node);
		node.left=dfs(root.left);
		node.right=dfs(root.right);
		node.random=dfs(root.random);
		
		return node;
	}

}
