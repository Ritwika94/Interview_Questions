package com.ritwika.practice;

import java.util.HashMap;

public class LargestSubArrayWithEqualNumberOfZerosAndOnes {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 }; 
        int size = arr.length; 
  
        System.out.println("Maximum Length of Subarray with Equal 0's and 1's is:"+findSubArray(arr, size)); 

	}

	private static int findSubArray(int[] arr, int n) {
		int maxLength=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				arr[i]=-1;
		}
		HashMap<Integer,Integer> hmap=new HashMap();
		int sum=0;
		int end=-1;
		int start=-1;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum==0) {
				maxLength=i+1;
				end=i;
				
			}
			if(hmap.containsKey(sum)) {
				if(maxLength<i-hmap.get(sum))
					maxLength=i-hmap.get(sum);
				  	end=i;
			}
			hmap.put(sum, i);
		}
		return maxLength;
	}

}
