package com.ritwika.practice;

public class MaximumSumPathInARightAngledTriangle {

	public static void main(String[] args) {
		  int tri[][] = {{1}, {2,1}, {3,3,2}}; 
          
	        System.out.println("Maximum Sum Path in the given Right Angled Triangle is:"+maxSum(tri)); 
	}

	private static int maxSum(int[][] T) {
		int n=T.length;
		if(n==1)
			return T[0][0];
		T[1][0]+=T[0][0];
		T[1][1]+=T[0][0];
		for(int i=2;i<n;i++) {
			T[i][0]+=T[i-1][0];
			T[i][i]+=T[i-1][i-1];
			for(int j=2;j<i;j++) {
				T[i][j]=Math.min(T[i-1][j], T[i-1][j-1]);
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max=Math.max(max, T[n-1][i]);
		}
		return max;
	}

}
