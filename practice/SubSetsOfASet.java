package com.ritwika.practice;

public class SubSetsOfASet {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		findSubsets(arr,arr.length);

	}

	private static void findSubsets(int[] arr, int n) {
		for(int i=0;i<(1<<n);i++) {
			System.out.print("[");
			for(int j=0;j<arr.length;j++) {
				if((i &(1<<j))>0) {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.print("]");
			System.out.println();
		}
		
	}

}
