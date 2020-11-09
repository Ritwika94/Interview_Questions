package com.ritwika.practice;

public class EightQueenProblem {
	static int N=0;
	public static void main(String[] args) {
		EightQueenProblem Queen = new EightQueenProblem(); 
	        Queen.solveNQ(); 

	}

	private static  boolean solveNQ() {
		 int board[][] = { { 0, 0, 0, 0 }, 
                 { 0, 0, 0, 0 }, 
                 { 0, 0, 0, 0 }, 
                 { 0, 0, 0, 0 } }; 
		 N=board.length;
		 if (solveNQUtil(board, 0) == false) { 
			 System.out.print("Solution does not exist"); 
			   return false; 
		 } 
		 printSolution(board); 
		 return true; 

		
	}

 static boolean solveNQUtil(int[][] board, int k) {
	 	if(k>=N)
		 return true;
	 	
		for(int i=0;i<N;i++) {
			
			if(isSafe(board, i,k)) {
				board[i][k]=1;
				if(solveNQUtil(board,k+1)) {
					return true;
				}
				board[i][k]=0;
			}
			
		}
		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col) {
	int r=board.length;
	int c=board[0].length;
	for(int i=0;i<col;i++) {
		if(board[row][i]==1)
			return false;
	}
	for(int i=row,j=col;i>=0 &&j>=0;i--,j--) {
		if(board[i][j]==1)
			return false;
	}
	for(int i=row,j=col;i<r &&j>=0;i++,j--) {
		if(board[i][j]==1)
			return false;
	}
	return true;
}

	private static void printSolution(int[][] board) {
		 for (int i = 0; i < N; i++) { 
	            for (int j = 0; j < N; j++) 
	                System.out.print(" " + board[i][j] 
	                                 + " "); 
	            System.out.println(); 
	        } 
		
	}

}
