package com.ritwika.practice;

public class MedianOfTwoSortedArrays {
	static int []a = new int[]{900}; 
    static int []b = new int[]{10, 13, 14}; 
	public static void main(String[] args) {
		 int n = a.length; 
	        int m = b.length; 
	    
	        if (n < m) 
	            System.out.print("The median is : " +  
	                   findMedianSortedArrays(n, m)); 
	        else
	            System.out.print("The median is : " +  
	                   findMedianSortedArrays(m, n)); 

	}

	private static int findMedianSortedArrays(int n, int m) {
		int l=0;
		int h=n;
		int i = 0,j = 0,median = 0;
		while(l<=h) {
			i=(l+h)/2;
			j=(n+m+1)/2-i;
			if(i<n && j>0 && b[j-1]>a[i]) {
				l=i+1;
			}
			else if(i>0 && j<m &&  b[j]<a[i-i]) {
				h=i-1;
			}
			else {
				if(i==0)
					median=b[j-1];
				else if(j==0)
					median=a[i-1];
				else
					median=Math.max(a[i-1], b[j-1]);
				break;
			}
		}
		if((n+m)%2==1)
			return median;
		if (i==n)
			return (median+b[j])/2;
		if(j==m)
			 return (median+a[i])/2;
		return (median+Math.min(a[i], b[j]))/2;
		
	}

}
