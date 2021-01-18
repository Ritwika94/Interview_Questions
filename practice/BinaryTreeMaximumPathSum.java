package com.ritwika.practice;

public class BinaryTreeMaximumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   int res=Integer.MIN_VALUE;
	    public int maxPathSum(TreeNode root) {
	        maxSum(root);
	        return res;
	    }
	     public int maxSum(TreeNode root){
	           if(root==null)
	            return 0;
	        int lh=maxSum(root.left);
	        int rh=maxSum(root.right);
	        
	        int maxSingle=Math.max(root.val,Math.max(lh,rh)+root.val);
	        
	        int maxTop=Math.max(maxSingle,lh+rh+root.val);
	        
	        res=Math.max(res,maxTop);
	        System.out.println(res);
	        
	        return maxSingle; 
	     }

}
