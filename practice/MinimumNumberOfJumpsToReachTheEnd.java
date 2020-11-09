package com.ritwika.practice;

public class MinimumNumberOfJumpsToReachTheEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }; 
        int size = arr.length; 
        System.out.println("Minimum number of"
                           + " dp to reach end is " + minJumps(arr, size)); 
    }

	private static int minJumps(int[] arr, int n) {
		int dp[]=new int[n];
		dp[n-1]=0;
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i]==0)
				 dp[i] = Integer.MAX_VALUE; 
			else if(arr[i]>=(n-1-i)) {
				//System.out.println(i);
				dp[i]=1;
			}
			else {
				
				dp[i]=Integer.MAX_VALUE;
				for(int j=1;j<=arr[i] && j<n;j++) {
					if(dp[i+j]==Integer.MAX_VALUE)
						continue;
					int temp=1+dp[i+j];
					if(temp<dp[i]) {
						
						dp[i]=temp;
					}
						
				}
				  
				  // another method
				/*
				 * int min = Integer.MAX_VALUE; for (int j = i + 1; j < n && j <= arr[i] + i;
				 * j++) { if (min > dp[j]) min = dp[j]; }
				 * 
				 * // Handle overflow if (min != Integer.MAX_VALUE) dp[i] = min + 1; else dp[i]
				 * = min;
				 */
			}
			
		}
	
		/*
		 * for(int i=0;i<n;i++) System.out.println(dp[i]);
		 */
		
			
		return dp[0];
		
		
	} 


}
