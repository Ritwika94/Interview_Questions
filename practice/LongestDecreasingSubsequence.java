package com.ritwika.practice;

public class LongestDecreasingSubsequence {

	public static void main(String[] args) {
		int[] arr= {15, 27, 14, 38, 63, 55, 46, 65, 85};
		System.out.println(maxDecresaing(arr));

	}
	public static int maxDecresaing(int[] arr) {
		int n=arr.length;
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
			temp[i]=1;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j] && temp[i]<1+temp[j])
					 temp[i]=1+temp[j];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(temp[i]+" ");
			
		}
		System.out.println();
		int max=temp[0];
		for(int i=0;i<n;i++) {
			if(temp[i]>max) {
				max=temp[i];
			}
			
		}
		return max;

	}

}
