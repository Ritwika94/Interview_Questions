package com.ritwika.practice;

public class EggDroppingProblem {

	public static void main(String[] args) {
		 int n = 2, k = 36; 
	        System.out.println("Minimum number of trials in worst"
	                           + " case with "
	                           + n + "  eggs and "
	                           + k + " floors is " + eggDrop(n, k)); 

	}

	private static int eggDrop(int n, int k) {
		int T[][]=new int[n+1][k+1];
		
		for(int i=0;i<=k;i++) {
			T[0][i]=0;
		}
		for(int i=1;i<=n;i++) {
			T[i][0]=0;
		}
		for(int i=1;i<=k;i++) {
			T[1][i]=i;
		}
		for(int i=1;i<=n;i++) {
			T[i][1]=1;
		}
		int res=0;
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=k;j++) {
				T[i][j]=Integer.MAX_VALUE;
				for(int x=1;x<=j;x++) {
					res=1+Math.max(T[i-1][x-1], T[i][j-x]);
					if(T[i][j]>res)
						T[i][j]=res;
				}
			}
		}
		return T[n][k];
				
		
	} 

}
