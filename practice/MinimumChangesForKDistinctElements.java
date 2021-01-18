package com.ritwika.practice;

import java.util.Arrays;
import java.util.Collections;

public class MinimumChangesForKDistinctElements {
	 static int MAX = 100005; 
	public static void main(String[] args) {
		  int [] arr = { 1, 2, 7, 8, 2, 3, 2, 3 }; 
          
	        int n = arr.length; 
	          
	        int k = 2; 
	          
	        System.out.println(minReplace(arr, n, k)); 

	}

	private static int minReplace(int[] arr, int n, int k) {
		Arrays.sort(arr);
		 Integer freq[]=new Integer[MAX];
		 Arrays.fill(freq, 0); 
		int p=0;
		freq[p]=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1])
				++freq[p];
			else
				++freq[++p];
		}
		 Arrays.sort(freq,Collections.reverseOrder()); 
		 int ans=0;
		 for(int i=k;i<=p;i++) {
			 ans+=freq[i];
		 }
		return ans;
	}

}
