package com.ritwika.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.ritwika.practice.PrintNodesAtADistanceKFromATargetNode.Node;

public class VerticalOrderTraversalOfTree {
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
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        System.out.println("Vertical Order traversal is"); 
        printVerticalOrder(root); 

	}
	private static void printVerticalOrder(Node root) {
	  TreeMap<Integer,List<Integer>> hmap=new TreeMap();
	  printVertical(root,0,hmap);
	  for(Map.Entry<Integer,List<Integer>> entry:hmap.entrySet()) {
		  //System.out.println("Key:"+entry.getKey());
		  List<Integer>alist=entry.getValue();
		  for(Integer val:alist)
			  System.out.print(val+" ");
		  System.out.println();
	  }
		
	}
	private static void printVertical(Node root, Integer level,TreeMap<Integer, List<Integer>> hmap) {
		if(root==null)
			return;
		if(hmap.get(level)==null) {
			List<Integer> alist=new ArrayList();
			alist.add(root.val);
			hmap.put(level, alist);
		}
		else {
			List<Integer> alist1=hmap.get(level);
			alist1.add(root.val);
			hmap.put(level, alist1);
		}
		printVertical(root.left,level-1,hmap);
		printVertical(root.right,level+1,hmap);
		
	}

}
