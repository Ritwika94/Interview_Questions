package com.ritwika.practice;

public class NumberOfSubsequencesWithSumZero {

	public static void main(String[] args) {
		 int a[] = {-1, 2, -2, 1}; 
	        int n = a.length; 
	        System.out.println(countSubSeq(0, 0, 0, a, n)); 

	}

	private static int countSubSeq(int i, int sum, int cnt, int[] a, int n) {
		if(i==n) {
			if(sum==0 && cnt>0)
				return 1;
			else
				return 0;
		}
		int res=0;
		res+=countSubSeq(i+1,sum,cnt,a,n);
		res+=countSubSeq(i+1,sum+a[i],cnt+1,a,n);
		
		return res;
	}

}
