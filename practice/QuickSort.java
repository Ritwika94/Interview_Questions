package com.ritwika.practice;

public class QuickSort {

	
		public static void main(String args[]) 
	    { 
	        int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = arr.length; 
	  
	        QuickSort ob = new QuickSort(); 
	        ob.qsort(arr, 0, n-1); 
	  
	        System.out.println("sorted array"); 
	       for(int i:arr)
	    	   System.out.print(i+" ");
	    }

		private void qsort(int[] arr, int l, int h) {
			if(l<h) {
				int partition=findPartition(arr,l,h);
				qsort(arr,l,partition-1);
				qsort(arr,partition+1,h);
			}
			
		}

		private int findPartition(int[] arr, int l, int h) {
			int partition=arr[h];
			int i=l-1;
			for(int j=l;j<=h-1;j++) {
				if(arr[j]<partition) {
					i++;
					swap(arr,i,j);
				}
			}
			swap(arr,i+1,h);
			return i+1;
		}

		private void swap(int[] arr, int i, int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}

		

}
