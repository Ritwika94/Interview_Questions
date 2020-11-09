package com.ritwika.practice;

public class BinarySearchTreeToGreaterSumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 int sum=0;
	    public TreeNode bstToGst(TreeNode root) {
	     
	        convertToGst(root);
	        return root;
	        
	    }
	    
	    public void convertToGst(TreeNode root) {
	        if(root==null)
	            return;
	        convertToGst(root.right);
	        sum=sum+root.val;
	        root.val=sum;
	        
	        convertToGst(root.left);
	        
	        
	    }

}
