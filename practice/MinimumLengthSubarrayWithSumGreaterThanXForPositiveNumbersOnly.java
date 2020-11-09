package com.ritwika.practice;

public class MinimumLengthSubarrayWithSumGreaterThanXForPositiveNumbersOnly {

	public static void main(String[] args) {
		int arr1[] = {1, 4, 45, 6, 10, 19}; 
        int x = 51; 
        int n1 = arr1.length; 
        System.out.println(smallestSubWithSum(arr1, n1, x));

	}

	private static int smallestSubWithSum(int[] arr, int n, int x) {
		int currSum=0;
		int start=0,end=0;
		int minLen=n+1;
		
		while(end<n) {
			while(currSum<=x && end<n) {
				if(currSum<0 && x>0) {
					
					currSum=0;
					start=end;
				}
				else
					currSum+=arr[end++];
					
				
					
			}
			while(currSum>x && start<n) {
				System.out.println("hi1");
				if(minLen> end-start) {
					
					minLen=end-start;
				}
					
				currSum-=arr[start++];
			}
		}
		
			
		return minLen;
	}
	
	

}
