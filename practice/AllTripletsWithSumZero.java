package com.ritwika.practice;

import java.util.HashSet;

public class AllTripletsWithSumZero {

	public static void main(String[] args) {
		int arr[] = {0, -1, 2, -3, 1}; 
        int n = arr.length; 
        findTriplets(arr, n); 

	}

	private static void findTriplets(int[] arr, int n) {
		boolean found=false;
		HashSet<Integer> hset=new HashSet();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int x=-(arr[i]+arr[j]);
				if(hset.contains(x)) {
					System.out.println("{"+arr[i]+","+arr[j]+","+x+"}");
					found=true;
				}
				hset.add(arr[j]);
					
			}
		}
		if(found==false)
			System.out.println("No such triplets");
		
	}

}
