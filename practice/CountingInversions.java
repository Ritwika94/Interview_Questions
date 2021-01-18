package com.ritwika.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingInversions {

	public static void main(String[] args) {
		int[] arr = { 1, 20, 6, 4, 5 }; 
		  
        System.out.println(mergeSortAndCount(arr, 0,  arr.length - 1)); 
  }

	private static int mergeSortAndCount(int[] arr, int l, int r) {
		int count=0;
		if(l<r) {
			int mid=l+(r-l)/2;
			count+=mergeSortAndCount(arr,l,mid);
			count+=mergeSortAndCount(arr,mid+1,r);
			count+=mergeAndCount(arr,l,r,mid);
		}
		return count;
	}

	private static int mergeAndCount(int[] arr, int l, int r, int mid) {
		int swaps=0;
		int i=0;
		int j=0;
		int k=l;
		int larray[]=Arrays.copyOfRange(arr, l, mid+1);
		int rarray[]=Arrays.copyOfRange(arr, mid+1,r+1);
		while(i<larray.length && j<rarray.length) {
			if(larray[i]<=rarray[j]) {
				arr[k++]=larray[i++];
			}
			else {
				arr[k++]=rarray[j++];
				swaps+=(mid+1)-(l+i);
			}
		}
		return swaps;
	}

}
