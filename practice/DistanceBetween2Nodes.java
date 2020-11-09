package com.ritwika.practice;

public class DistanceBetween2Nodes {
	static class Node {
        int value;
        Node left;
        Node right;
 
        public Node(int value) {
            this.value = value;
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
	        System.out.println("Dist(4, 5) = "
	                             + findDistance(root, 4, 5));
	                              
	        System.out.println("Dist(4, 6) = "
	                             + findDistance(root, 4, 6));
	                              
	        System.out.println("Dist(3, 4) = "
	                             + findDistance(root, 3, 4));
	                              
	        System.out.println("Dist(2, 4) = "
	                             + findDistance(root, 2, 4));
	                              
	        System.out.println("Dist(8, 5) = "
	                             + findDistance(root, 8, 5));

	}
	private static int findDistance(Node root, int n1, int n2) {
		Node lowestCommonAncestor=findLCA(root,n1,n2);
		
		int d1=findLevel(lowestCommonAncestor,n1,0);
		int d2=findLevel(lowestCommonAncestor,n2,0);
		return d1+d2;
	}
	private static Node findLCA(Node root, int n1, int n2) {
		if(root==null)
			return null;
		if(root.value==n1 || root.value==n2) {
			return root;
		}
			
		Node ls=findLCA(root.left,n1,n2);
		Node rs=findLCA(root.right,n1,n2);
		if(ls!=null && rs!=null) {
			return root;
		}
		return (ls!=null ? ls:rs);
	}
	private static int findLevel(Node root, int n1, int level) {
		if(root==null)
			return -1;
		if(root.value==n1)
			return level;
		int lh=findLevel(root.left,n1,level+1);
		if(lh==-1)
			return findLevel(root.right,n1,level+1);
		
		return  lh;
					
		
	}

}
