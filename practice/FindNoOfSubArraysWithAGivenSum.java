package com.ritwika.practice;

import java.util.HashMap;

public class FindNoOfSubArraysWithAGivenSum {

	 public static void main(String[] args) 
    { 
  
        int arr[] = { 10, 2, -2, -20, 10 }; 
        int sum = -10; 
        int n = arr.length; 
        System.out.println(findSubarraySum(arr, n, sum)); 
    }

	private static int findSubarraySum(int[] arr, int n, int sum) {
		int currSum=0;
		HashMap<Integer,Integer> hmap=new HashMap();
		int count=0;
		for(int i=0;i<n;i++) {
			currSum+=arr[i];
			if(currSum==sum) {
				count++;
			}
			if(hmap.containsKey(currSum-sum))
				count+=hmap.get(currSum-sum);
			hmap.put(currSum, hmap.getOrDefault(currSum, 0)+1);
			
			
		}
		return count;
	} 

}
