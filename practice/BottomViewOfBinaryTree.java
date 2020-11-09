package com.ritwika.practice;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import com.ritwika.practice.TopViewOfBinaryTree.Node;
import com.ritwika.practice.TopViewOfBinaryTree.QueueObj;

public class BottomViewOfBinaryTree {
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
	private static Node root;
	public BottomViewOfBinaryTree(Node node) {
		 root = node;  
	}
	public static void main(String[] args) {
		Node root = new Node(20); 
        root.left = new Node(8); 
        root.right = new Node(22); 
        root.left.left = new Node(5); 
        root.left.right = new Node(3); 
        root.right.left = new Node(4); 
        root.right.right = new Node(25); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); 
        BottomViewOfBinaryTree tree = new BottomViewOfBinaryTree(root); 
        System.out.print("Bottom view of the given binary tree:"); 
        tree.bottomView(); 

	}
	private void bottomView() {
		Queue<QueueObj> q=new LinkedList<QueueObj>();
		TreeMap<Integer,Node> hmap=new TreeMap();
		q.add(new QueueObj(root,0));
		
		while(!q.isEmpty()) {
			QueueObj temp=q.poll();
			hmap.put(temp.hd, temp.node);
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
