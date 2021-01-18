package com.ritwika.practice;

public class CountAllPalindromeSubStringsInAString {

	public static void main(String[] args) {
		  String str = "abaab";
	        System.out.println(CountPS(str.toCharArray(), str.length()));

	}

	private static int CountPS(char[] arr, int n) {
		int dp[][]=new int[n][n];
		boolean P[][]=new boolean[n][n];
		for(int i=0;i<n;i++)
			P[i][i]=true;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				 P[i][i + 1] = true;
	             dp[i][i + 1] = 1;
			}
				
		}
		for(int cl=2;cl<n;cl++) {
			for(int i=0;i<n-cl;i++) {
				int j=i+cl;
				if(arr[i]==arr[j] && P[i+1][j-1])
					P[i][j]=true;
				if(P[i][j]) {
					dp[i][j]=dp[i+1][j]+dp[i][j-1]+1-dp[i+1][j-1];
				}
				else
					dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
			}
		}
			
		return dp[0][n-1];
		
	}

}
