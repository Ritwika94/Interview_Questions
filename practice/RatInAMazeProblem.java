package com.ritwika.practice;

public class RatInAMazeProblem {

	public static void main(String[] args) {
		RatInAMazeProblem rat = new RatInAMazeProblem(); 
	        int maze[][] = { { 1, 0, 0, 0 }, 
	                         { 1, 1, 0, 1 }, 
	                         { 0, 1, 0, 0 }, 
	                         { 1, 1, 1, 1 } }; 
	  
	        int n = maze.length; 
	        rat.solveMaze(maze,n);

	}

	private static void solveMaze(int[][] maze, int n) {
		int sol[][]=new int[n][n];
		if(solveUntil(maze,0,0,n,sol)==false) {
			System.out.println("No solution");
		}
		System.out.println("There is a solution as follows:");
		printSolution(sol,n);
		
		
	}

	private static boolean solveUntil(int[][] maze, int i, int j, int n, int[][] sol) {
		if(i==n-1 && j==n-1) {
			sol[i][j]=1;
			return true;
		}
		if(isSafe(maze,i,j,n)) {
			sol[i][j]=1;
			if(solveUntil(maze,i+1,j,n,sol))
				return true;
			if(solveUntil(maze,i,j+1,n,sol))
				return true;
			sol[i][j]=0;
			return false;
		}
		
		
		return false;
	}

	private static boolean isSafe(int[][] maze, int i, int j, int n) {
		return (i>=0 && i<n && j>=0 && j<n && maze[i][j]==1);
	}

	private static void printSolution(int[][] sol,int n) {
		for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print( 
                    " " + sol[i][j] + " "); 
            System.out.println(); 
        } 
		
	}

	

}
