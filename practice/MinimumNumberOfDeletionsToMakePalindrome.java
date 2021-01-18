package com.ritwika.practice;

public class MinimumNumberOfDeletionsToMakePalindrome {

	public static void main(String[] args) {
		String X = "ACBCDBAA";
        int n = X.length();
 
        System.out.print("The minimum number of deletions required are " +
                                minDeletions(X, n));

	}
	 public static int minDeletions(String X, int n) {
		 String Y=new StringBuilder(X).reverse().toString();
		 int dp[][]=new int[n+1][n+1];
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 if(X.charAt(i-1)==Y.charAt(j-1))
					 dp[i][j]=1+dp[i-1][j-1];
				 else
					 dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				 
			 }
		 }
		return n-dp[n][n];
	 }

}
