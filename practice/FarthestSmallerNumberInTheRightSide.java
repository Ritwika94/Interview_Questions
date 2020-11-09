package com.ritwika.practice;

public class FarthestSmallerNumberInTheRightSide {

	public static void main(String[] args) {
		 int [] a = { 3, 1, 5, 2, 4 }; 
		    int n = a.length; 
		  
		    farthest_min(a, n); 

	}

	private static void farthest_min(int[] a, int n) {
		int suffix[]=new int[n];
		suffix[n-1]=a[n - 1]; 
		for(int i=n-2;i>=0;i--) {
			suffix[i]=Math.min(suffix[i+1],a[i]);
		}
		for(int i=0;i<n;i++) {
			int l=i+1;
			int h=n-1;
			int ans=-1;
			while(l<=h) {
				int mid=l+(h-l)/2;
				if(suffix[mid]<a[i]) {
					ans=mid;
					l=mid+1;
				}
				else
					h=mid-1;
			}
			  System.out.print(ans + " "); 
			
		}
		
	}

}
