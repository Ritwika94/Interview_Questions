package com.ritwika.practice;

public class FindTheRowWithMaximumNumberOfOnes {

	public static void main(String[] args) {
		  int mat[][] = { { 0, 0, 0, 1 }, 
                  { 0, 1, 1, 1 }, 
                  { 1, 1, 1, 1 }, 
                  { 0, 0, 0, 0 } }; 
		  System.out.println("Index of row with maximum 1s is "
                                      + rowWithMax1s(mat)); 

	}

	private static int rowWithMax1s(int[][] mat) {
		int r=mat.length;
		int c=mat[0].length;
		int max=Integer.MIN_VALUE;
		int maxVal=-1;
		
		for(int i=0;i<r;i++) {
			int index=findIndex(mat[i],0,c-1);
			if(index!=-1 && (c-index)>max) {
				max=c-index;
				maxVal=i;
			}
		}
		return maxVal;
	}

	private static int findIndex(int[] arr, int l ,int h) {
		
		if(l<=h) {
			int mid=l+(h-l)/2;
			if((mid==0 ||arr[mid-1]==0)&& arr[mid]==1)
				return mid;
			else if( arr[mid]==0)
				return findIndex(arr,mid+1,h);
			else
				return findIndex(arr,l,mid-1);
			
		}
		
		return -1;
	}

}
