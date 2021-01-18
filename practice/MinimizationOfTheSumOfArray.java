package com.ritwika.practice;

import java.util.PriorityQueue;

public class MinimizationOfTheSumOfArray {

	public static void main(String[] args) {
		 int arr[] = { 1, 3, 7, 5, 6 }; 
	     int n = arr.length; 
	     System.out.print(getMinSum(arr, n)); 

	}

	private static int getMinSum(int[] arr, int n) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++)
			pq.add(arr[i]);
		int sum=0;
		while(pq.size()>1) {
			int x=pq.poll();
			int y=pq.poll();
			sum+=x+y;
			pq.add(x+y);
			
		}
		
		return sum;
	}

}
