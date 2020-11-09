package com.ritwika.practice;

public class MatrixChainMultiplication {

	 public static void main(String args[]) 
	    { 
	        int arr[] = new int[] { 1, 2, 3, 4 }; 
	        int size = arr.length; 
	  
	        System.out.println("Minimum number of multiplications is " + matrixChainOrder(arr, size)); 
	    }

	private static int matrixChainOrder(int[] arr, int n) {
		int T[][]=new int[n][n];
		for(int i=0;i<n;i++)
			T[i][i]=0;
		int q=0;
		for(int cl=2;cl<=n;cl++) {
			for(int i=1;i<n-cl+1;i++) {
				int j=i+cl-1;
				if(j==n)
					continue;
				T[i][j]=Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++) {
					q=T[i][k]+T[k+1][j]+ arr[i-1]*arr[j]*arr[k];
					if(q<T[i][j])
						T[i][j]=q;
				}
			}
		}
		return T[1][n-1];
		
	}

}
