package com.ritwika.practice;

public class SortAnArrayCOntainingZeroOneTwo {

	public static void main(String[] args) {
		 int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
	        int n = arr.length; 
	        sortArr(arr, n); 

	}

	private static void sortArr(int[] arr, int n) {
		int cnt0 = 0,cnt1 = 0,cnt2 = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				cnt0++;
			else if(arr[i]==1)
				cnt1++;
			else if(arr[i]==2)
				cnt2++;
		}
		int i=0;
		
			while(cnt0>0) {
				arr[i++]=0;
				cnt0--;
			}
			while(cnt1>0) {
				arr[i++]=1;
				cnt1--;
			}
				
			while(cnt2>0) {
				arr[i++]=2;
				cnt2--;
			}
			printArr(arr, n); 			
		
		
	}

	private static void printArr(int[] arr, int n) {
		for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
		
	}
}
