package com.ritwika.practice;

public class MaximumSumPathFromRootToLeaf {

	private TreeNode root=null;
	private TreeNode leafNode=null;
	private int max=Integer.MIN_VALUE;

	public static void main(String[] args) {
		
	    { 
			MaximumSumPathFromRootToLeaf tree = new MaximumSumPathFromRootToLeaf(); 
	        tree.root = new TreeNode(10); 
	        tree.root.left = new TreeNode(-2); 
	        tree.root.right = new TreeNode(7); 
	        tree.root.left.left = new TreeNode(8); 
	        tree.root.left.right = new TreeNode(-4); 
	        tree.maxSumPath(); 
	        
	    } 

	}

	private void maxSumPath() {
		findTargetLeaf(root,0);
		System.out.println("MaxSum:"+max);
		printPath(root,leafNode);
		
	}

	private boolean printPath(TreeNode root, TreeNode leafNode) {
		if(root==null)
			return false;
		if(root==leafNode || printPath(root.left,leafNode) || printPath(root.right,leafNode)) {
			System.out.print(root.val+" ");
			return true;
		}
		return false;	
		
		
	}

	private void findTargetLeaf(TreeNode root, int cursum) {
		if(root==null)
			return;
		cursum+=root.val;
		if(root.left==null && root.right==null) {
			if(cursum>max) {
				max=cursum;
				leafNode=root;
				return;
			}
			
		}
		findTargetLeaf(root.left,cursum);
		findTargetLeaf(root.right,cursum);
	}

}
