package com.ritwika.practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {
	static class Node { 
	    int data; 
	    Node left, right; 
	  
	    public Node(int data) { 
	        this.data = data; 
	        left = right = null; 
	    } 
	}
	 static class QueueObj { 
         Node node; 
         int hd; 

         QueueObj(Node node, int hd) { 
             this.node = node; 
             this.hd = hd; 
         } 
     }
	private Node root; 
	public TopViewOfBinaryTree() { 
        root = null; 
    } 
	public static void main(String[] args) {
       
	   TopViewOfBinaryTree tree = new TopViewOfBinaryTree(); 
       tree.root = new Node(1); 
       tree.root.left = new Node(2); 
       tree.root.right = new Node(3); 
       tree.root.left.right = new Node(4); 
       tree.root.left.right.right = new Node(5); 
       tree.root.left.right.right.right = new Node(6); 
       System.out.print("Following are nodes in top view of Binary Tree:");  
       tree.topView(tree.root);  

	}
	private void topView(Node root) {
		Queue<QueueObj> q=new LinkedList<QueueObj>();
		TreeMap<Integer,Node> hmap=new TreeMap();
		
		q.add(new QueueObj(root,0));
		while(!q.isEmpty()) {
			QueueObj temp=q.poll();
			if(!hmap.containsKey(temp.hd)) {
				hmap.put(temp.hd, temp.node);
			}
			if(temp.node.left!=null) {
				q.add(new QueueObj(temp.node.left,temp.hd-1));
			}
			if(temp.node.right!=null) {
				q.add(new QueueObj(temp.node.right,temp.hd+1));
			}
		}
		for(Map.Entry<Integer,Node> entry:hmap.entrySet()) {
			Node  node=entry.getValue();
			System.out.print(node.data+" ");
		}
		
	}

}
