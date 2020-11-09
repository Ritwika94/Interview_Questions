package com.ritwika.practice;

public class ConnectLeavesIntoaDLL {
	 Node root; 
	 Node head; 
	 Node prev; 
	static class Node{
		int val;
		Node left;
		Node right;
		public Node(int val) {
			this.val=val;
			left=right=null;
		}
	}
	 public void extractLeafList(Node root) {
		 
		 if(root==null)
			 return ;
		 if(root.left==null && root.right==null) {
			 if(head==null) {
				 
				 head=root;
				 prev=root;
			 }
			 else
			 {
				
				 prev.right=root;
				 root.left=prev;
				 prev=root;
			 }
			 	return ;
		 }
		 
		extractLeafList(root.left);
		
		 extractLeafList(root.right);
		
		 
	 }
	public static void main(String[] args) {
		ConnectLeavesIntoaDLL tree = new ConnectLeavesIntoaDLL(); 
	     tree.root = new Node(1); 
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	        tree.root.right.right = new Node(6); 
	        tree.root.left.left.left = new Node(7); 
	        tree.root.left.left.right = new Node(8); 
	        tree.root.right.right.left = new Node(9); 
	        tree.root.right.right.right = new Node(10); 
	       tree.inorder(tree.root); 
	        tree.extractLeafList(tree.root); 
	        tree.printDLL(tree.head); 

	}



	private void inorder(Node node) {
		if (node == null) 
            return; 
        inorder(node.left); 
        System.out.print(node.val + " "); 
        inorder(node.right); 
		
	}



	private void printDLL(Node head) {
		
		while(head!=null) {
			System.out.println(head.val);
			head=head.right;
		}
		
		
	}

}
