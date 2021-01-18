package com.ritwika.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumOfSubArraysOfSizeK {
	static ArrayList<Integer> alist=new ArrayList();
	public static void main(String[] args) {
		int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int k = 4, n = arr.length;
		ArrayList<Integer> al=findKMaxElement(arr,k,n);
		 for(Integer i:al) {
			 System.out.print(i+" ");
		 }

	}
	public static ArrayList<Integer> findKMaxElement(int[] arr,int k, int n){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		int i=0;
		for(i=0;i<k;i++)
			pq.add(arr[i]);
		alist.add(pq.peek());
		pq.remove(arr[0]);
		while(i<arr.length){
			pq.add(arr[i]);
			alist.add(pq.peek());
			pq.remove(arr[i-k+1]);
			i++;
		}
		return alist;
		
	}
            



}
