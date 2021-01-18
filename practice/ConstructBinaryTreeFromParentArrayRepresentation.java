package com.ritwika.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/****
 * 
 * @author Ritu
 * https://www.geeksforgeeks.org/construct-a-binary-tree-from-parent-array-representation/
 *
 */
public class ConstructBinaryTreeFromParentArrayRepresentation {
	class Node  
	{ 
	    int key; 
	    Node left, right; 
	   
	    public Node(int key)  
	    { 
	        this.key = key; 
	        left = right = null; 
	    } 
	} 
	public static void main(String[] args) {
		ConstructBinaryTreeFromParentArrayRepresentation tree = new ConstructBinaryTreeFromParentArrayRepresentation(); 
        int parent[] = new int[]{-1, 0, 0, 1, 1, 3, 5}; 
        int n = parent.length; 
        Node node = tree.createTree(parent, n); 
        System.out.println("Inorder traversal of constructed tree "); 
        tree.inorder(node); 
        tree.newLine();

	}
	Node root=null;
	private Node createTree(int[] parent, int n) {
		HashMap<Integer,List<Integer>> hmap=new HashMap();
		for(int i=0;i<n;i++) {
			int x=parent[i];
			if(hmap.get(x)==null) {
				List<Integer> alist=new ArrayList();
				alist.add(i);
				hmap.put(x,alist);
			}
			else {
				List<Integer> alist=hmap.get(x);
				alist.add(i);
				hmap.put(x,alist);
			}
		}
		Integer rootVal=hmap.get(-1).get(0);
		if(rootVal==null)
			return null;
		root=new Node(rootVal);
		buildTree(root,hmap);
		
		return root;
	}
	 private void buildTree(Node root, HashMap<Integer, List<Integer>> hmap) {
		 if(root==null)
			 return;
		List<Integer> l1=hmap.get(root.key);
			if(l1!=null &&l1.size()==1) {
				root.left=new Node(l1.get(0));
			}
			if(l1!=null &&l1.size()==2) {
				root.left=new Node(l1.get(0));
				root.right=new Node(l1.get(1));
			}
			if(l1!=null&& l1.size()==0) {
				root.left=null;
				root.right=null;
			}
			buildTree(root.left,hmap);
			buildTree(root.right,hmap);
		
	}
	void newLine()  
	    { 
	        System.out.println(""); 
	    } 
	   

	    void inorder(Node node)  
	    { 
	        if (node != null)  
	        { 
	            inorder(node.left); 
	            System.out.print(node.key + " "); 
	            inorder(node.right); 
	        } 
	    } 

}
