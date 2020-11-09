package com.ritwika.practice;

public class MaximumSumTriplet {

	public static void main(String[] args) {
		 int arr[] = { 1, 0, 8, 6, 4, 2 }; 
	        int n = arr.length; 
	        System.out.println(maxTripletSum(arr, n));

	}

	private static int maxTripletSum(int[] arr, int n) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max3=max2;
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2) {
				max3=max2;
				max2=arr[i];
			}
			else if(arr[i]>max3) {
				max3=arr[i];
			}
		}
		
		return max1+max2+max3;
	}

}
