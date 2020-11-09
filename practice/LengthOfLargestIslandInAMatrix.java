package com.ritwika.practice;

import java.util.Arrays;

public class LengthOfLargestIslandInAMatrix {
    static int row[]= {-1,-1,-1,0,0,1,1,1};
    static int col[]= {-1,0,1,-1,1,-1,0,1};
    static int count=0;
    static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		int M[][] = { { 0, 0, 1, 1, 0 }, 
                { 1, 0, 1, 1, 0 }, 
                { 0, 1, 0, 0, 0 }, 
                { 0, 0, 0, 0, 1 } }; 
		System.out.println(largestRegion(M));

	}
	static int largestRegion(int[][] M) 
	{
		int r=M.length;
		int c=M[0].length;
		boolean visited[][]=new boolean[r][c];
		for(int i=0;i<r;i++) {
			Arrays.fill(visited[i], false);
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(M[i][j]==1 && !(visited[i][j])) {
					 count=1;
					dfs(M,visited,r,c,i,j);
					max=Math.max(max, count);
				}
			}
		}
				
	return max;
		
	}
	private static void dfs(int[][] m, boolean[][] visited, int r, int c, int i, int j) {
		visited[i][j]=true;
		for(int k=0;k<8;k++) {
			if(isSafe(i+row[k],j+col[k],r,c,visited,m)) {
				count++;
				dfs(m,visited,r,c,i+row[k],j+col[k]);
			}
		}
		
	}
	private static boolean isSafe(int i, int j, int r, int c, boolean[][] visited, int[][] M) {
		return((i>=0)&& (i<r) && (j>=0) && (j<c) && (M[i][j]==1)&& (visited[i][j]==false));
	}
     

}
