package com.ritwika.practice;

public class ZeroByOneKnapsack {

	 public static void main(String arg[]) 
	    { 
	        int val[] = { 60, 100, 120 }; 
	        int wt[] = { 10, 20, 30 }; 
	        int W = 50; 
	        int n = val.length; 
	  
	        printknapSack(W, wt, val, n); 
	    }

	private static void printknapSack(int w, int[] wt, int[] val, int n) {
		int T[][]=new int[n+1][w+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=w;j++) {
				if(i==0 || j==0)
					T[i][j]=0;
				else if(j<wt[i-1])
					T[i][j]=T[i-1][j];
				else if(j>=wt[i-1]) {
					T[i][j]=Math.max(T[i-1][j], T[i-1][j-wt[i-1]]+val[i-1]);
				}
					
				
			}
		}
		System.out.println("Maximum value:"+T[n][w]);
		
		int res=T[n][w];
		int K=w;
		for(int i=n;i>=0 && res>0;i--) {
			if(res==T[i-1][K])
				continue;
			else
			{
				System.out.print(wt[i-1]+" ");
				res-=val[i-1];
				K-=wt[i-1];
			}
			
		}
		
	} 

}
