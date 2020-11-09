package com.ritwika.practice;

import java.util.List;
import java.util.Vector;

public class FindLargestValueInEachLevelOfBinaryTree {
	static class Node  
	{  
	    int val;  
	    Node left, right;  
	}; 
	public static void main(String[] args) {
		   Node root = null;  
		    root = newNode(4);  
		    root.left = newNode(9);  
		    root.right = newNode(2);  
		    root.left.left = newNode(3);  
		    root.left.right = newNode(5);  
		    root.right.right = newNode(7);  
		      
		    List<Integer> res = largestValues(root);  
		    for (int i = 0; i < res.size(); i++)  
		        	System.out.println(res.get(i));

	}
	private static List<Integer> largestValues(Node root) {
		Vector<Integer> res=new Vector();
		largestValuesUtil(res,root,0);
		return res;
	}
	private static void largestValuesUtil(Vector<Integer> res, Node root, int d) {
		if(root==null)
			return;
		if(d==res.size())
			res.add(root.val);
		else {
			res.set(d, Math.max(res.get(d), root.val));
		}
		largestValuesUtil(res,root.left,d+1);
		largestValuesUtil(res,root.right,d+1);
		
	}
	private static Node newNode(int data) {
		Node temp = new Node();  
	    temp.val = data;  
	    temp.left = temp.right = null;  
	    return temp;  
	}

}
