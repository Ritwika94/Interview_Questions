package com.ritwika.practice;

public class SmallestMissingPositiveNumber {

	public static void main(String[] args) {
		 int A[] = { 0, 10, 2, -10, -20 }; 
	        System.out.println(smallestMissingPositiveNumber(A)); 

	}
	public static int smallestMissingPositiveNumber(int[] arr) {
		int n=arr.length;
		boolean positive[]=new boolean[n+1];
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0 && arr[i]<=n)
				positive[arr[i]]=true;
		}
		for(int i=1;i<=n;i++) {
			if(!positive[i])
				return i;
				
		}
		return n+1;
	}
	

}
