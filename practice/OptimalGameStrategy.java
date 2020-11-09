package com.ritwika.practice;

public class OptimalGameStrategy {

	public static void main(String[] args) {
		int arr1[] = { 8, 15, 3, 7 }; 
        int n = arr1.length; 
        System.out.println( 
            "Maximum value to win:"
            + optimalStrategyOfGame(arr1, n)); 
  
        int arr2[] = { 2, 2, 2, 2 }; 
        n = arr2.length; 
        System.out.println( 
            "Maximum value to win:"
            + optimalStrategyOfGame(arr2, n)); 
  
        int arr3[] = { 20, 30, 2, 2, 2, 10 }; 
        n = arr3.length; 
        System.out.println( 
            "Maximum value to win:"
            + optimalStrategyOfGame(arr3, n)); 

	}

	private static int optimalStrategyOfGame(int[] arr, int n) {
		int T[][]=new int[n][n];
		int gap=0,i=0,j=0;
		for(gap=0;gap<n;++gap) {
			for(i=0,j=gap;j<n;++i,++j) {
				int x=i+2<=j?T[i+2][j]:0;
				int y=i+1<=j-1?T[i+1][j-1]:0;
				int z=i<=j-2?T[i][j-2]:0;
				
				T[i][j]=Math.max(arr[i]+Math.min(x, y), arr[j]+Math.min(z, y));
				
			}
		}
		return T[0][n-1];
	}

}
