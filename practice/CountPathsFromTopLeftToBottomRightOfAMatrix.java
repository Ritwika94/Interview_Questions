package com.ritwika.practice;

public class CountPathsFromTopLeftToBottomRightOfAMatrix {

	public static void main(String[] args) {
		System.out.println(numberOfPaths(3, 3)); 

	}

	private static int numberOfPaths(int m, int n) {
		int count[][]=new int[m][n];
		for(int i=0;i<n;i++)
			count[0][i]=1;
		for(int i=0;i<m;i++)
			count[i][0]=1;
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				count[i][j]=count[i-1][j]+count[i][j-1];
			}
		}
			
		return count[m-1][n-1];
	}

}
