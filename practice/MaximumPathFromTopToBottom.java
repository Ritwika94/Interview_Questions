package com.ritwika.practice;

public class MaximumPathFromTopToBottom {

	public static void main(String[] args) {
		 int mat[][] = { { 5, 6, 1, 7 }, 
                 { -2, 10, 8, -1 }, 
                 { 3, -7, -9, 11 }, 
                 { 12, -4, 2, 6 } }; 
		 int n = 4; 

		 System.out.println("Maximum Sum = "+ 
                     maxSum(mat , n)); 

	}

	private static int maxSum(int[][] mat, int n) {
		if(n==1)
			return mat[0][0];
		
		int T[][]=new int[n][n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
			T[n-1][i]=mat[n-1][i];
		
		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<n;j++) {
				if(j+1<n && j-1>=0) {
					System.out.println(i+" "+j);
					T[i][j]=mat[i][j]+Math.max(T[i+1][j+1],T[i+1][j-1]);
				}
				else if(j+1<n) {
					
					T[i][j]=mat[i][j]+T[i+1][j+1];
				}
					
				else if(j-1>=0) 
					T[i][j]=mat[i][j]+T[i+1][j-1];
			}
		}
		for(int i=0;i<n;i++) {
			max=Math.max(max, T[0][i]);
		}
		return max;
	}

}
