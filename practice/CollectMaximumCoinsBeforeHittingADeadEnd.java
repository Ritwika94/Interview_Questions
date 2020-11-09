package com.ritwika.practice;

public class CollectMaximumCoinsBeforeHittingADeadEnd {

	public static void main(String[] args) {
		 int arr[][] = { {1,1,0,0,1,0}, 
                 {0,0,1,1,0,0}, 
                 {0,0,0,0,1,1}, 
                 {0,0,0,0,0,1},
                 {1,0,0,1,0,0},
                 {1,1,1,0,0,1},
               }; 
		 
		 System.out.println("Maximum Sum is:"+maxCoins(arr));

	}

	private static int maxCoins(int[][] arr) {
		int n=arr.length;
		int dp[][]=new int[n+1][n+1];
		
		 maxCoinsUntil(dp,arr,0,0,n);
		 for(int i=0;i<=n;i++) {
			 for(int j=0;j<=n;j++) {
				 System.out.print(dp[i][j]+" ");
				 
			 }
			 System.out.println(); 
		 }
		 return dp[0][0];
	}

	private static int maxCoinsUntil(int[][] dp, int[][] arr, int i, int j, int n) {
		if(!isSafe(i,j,n))
			return 0;
		
		
		dp[i][j]=arr[i][j]+Math.max(maxCoinsUntil(dp,arr,i,j+1,n), maxCoinsUntil(dp,arr,i+1,j,n));
		//System.out.println(i+" "+j);
		//System.out.println(dp[i][j]);
		return dp[i][j];
	}

	private static boolean isSafe(int i, int j, int n) {
		
		return (i>=0 && i<n && j>=0 && j<n);
	}

}
