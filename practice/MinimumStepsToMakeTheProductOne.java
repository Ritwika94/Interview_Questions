package com.ritwika.practice;

public class MinimumStepsToMakeTheProductOne {

	public static void main(String[] args) {
		 int a[] = { -2, 4, 0  };  
	        int n = a.length;  
	      
	        System.out.println(minStep(a, n));  

	}

	private static int minStep(int[] a, int n) {
		int positive=0;
		int negative=0;
		int zeros=0;
		int steps=0;
		
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				
				negative++;
				steps+=(-1-a[i]);
			
				
			}
			if(a[i]>0) {
				positive++;
				steps+=a[i]-1;
			
			}
			if(a[i]==0) {
				steps=steps+1;
				System.out.println(steps);
				zeros++;
			}
		}
		
		if(negative%2==0 && zeros>=1)
			return steps;
		if(negative%2==0 && zeros>=1)
			return steps;
		
		if(negative%2==1 && zeros==0) {
			steps=steps+2;
			
		}
		return steps;
	}

}
