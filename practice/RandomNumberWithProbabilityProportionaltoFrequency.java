package com.ritwika.practice;

public class RandomNumberWithProbabilityProportionaltoFrequency {
	public static void main(String args[]) 
	{  
	    int arr[] = {1, 2, 3, 4};  
	    int freq[] = {10, 5, 20, 100};  
	    int i, n = arr.length;  
	  
	    for (i = 0; i < 5; i++)  
	    System.out.println( myRand(arr, freq, n) );  
	}

	private static int myRand(int[] arr, int[] freq, int n) {
		int prefix[]=new int[n];
		prefix[0]=freq[0];
		for(int i=1;i<n;i++)
			prefix[i]=prefix[i-1]+freq[i];
		
		int random=((int) Math.random()*(323567) %prefix[n-1])+1;
		
		int index=findCeil(prefix,random,0,n-1);
	
		return arr[index];
	}

	private static int findCeil(int[] prefix, int r, int l, int h) {
	    int mid=0;
		while(l<h) {
			mid=l+(h-l)/2;
			if(prefix[mid]<r)
				l=mid+1;
			else
				h=mid;
			
		}
		return prefix[mid]>=r?l:-1;
	}  

}
