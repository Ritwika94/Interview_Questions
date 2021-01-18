package com.ritwika.practice;

public class FindNumberOfSubarraysWithEvenSum {

	public static void main(String[] args) {
		  
		int arr[] = {1, 2, 2, 3, 4, 1}; 
		int n = arr.length; 
		  
		System.out.println("The Number of Subarrays"+  
		                       " with even sum is " + 
		                      countEvenSum (arr, n)); 
		}

	public static int countEvenSum(int arr[],int n) {
		int temp[]= {1,0};
		int sum=0;
		int result=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=(((sum+arr[i])%2)+2)%2;
			temp[sum]++;
		}
		result=result+(((temp[0])*(temp[0]-1))/2);
		result=result+(((temp[1])*(temp[1]-1))/2);
		return result;
		
	}
             

}
