package com.ritwika.practice;

public class MinimumLengthSubArrayGreaterThanXForNegativeAndPositiveCasesBoth {

	public static void main(String[] args) {
		int arr1[] = {1, 4, 45, 6, 10, 19}; 
        int x = 51; 
        int n1 = arr1.length; 
        System.out.println(smallestSubWithSum(arr1, n1, x));


	}

	private static int smallestSubWithSum(int[] arr, int n, int x) {
		int min=Integer.MAX_VALUE;
		int minLength=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
			min=Math.min(arr[i], min);
		int target=x;
		
		int currSum=arr[0]+Math.abs(min);
		int start=0;
		int end=0;
		for(int i=1;i<=n;i++) {
			while(currSum-(i-start)*Math.abs(min)>target && start<(i-1)) {
				System.out.println("Hi");
				if(minLength>(end-start+1))
					minLength=end-start+1;
				
				currSum = currSum - arr[start] -   Math.abs(min);  
                       
				start++;  
			}
			if(i<n) {
				
				currSum=currSum+arr[i]+Math.abs(min);
				end=i;
			}
		}
		return minLength;
		
	}

}
