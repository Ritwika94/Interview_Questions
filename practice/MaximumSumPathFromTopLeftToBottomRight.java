package com.ritwika.practice;

public class MaximumSumPathFromTopLeftToBottomRight {

	public static void main(String[] args) {
		int [][]grid = {{3,7}, {9,7}}; 
		System.out.print("Maximum Sum Path is:"+maximumPath(grid)); 

	}

	private static int maximumPath(int[][] grid) {
		int r=grid.length;
		int c=grid[0].length;
				
		int T[][]=new int[r][c];
		T[0][0]=grid[0][0];
		for(int i=1;i<c;i++)
			T[0][i]=grid[0][i]+T[0][i-1];
		for(int i=1;i<r;i++)
			T[i][0]=grid[i][0]+T[i-1][0];
		for(int i=1;i<r;i++) {
			for(int j=1;j<c;j++) {
				T[i][j]=grid[i][j]+Math.max(T[i][j-1], T[i-1][j]);
			}
		}
		return T[r-1][c-1];
	}

}
