package com.ritwika.practice;

public class FindZerosToBeRemovedToMaximizeNumberOfOnes {

	public static void main(String[] args) {
		int m = 2; 
		int arr[] = new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1}; 
        System.out.println("Indexes of zeroes to be flipped are "); 
          
        findZeroes(arr,m); 

	}

	private static void findZeroes(int[] arr, int m) {
		int l=0;
		int h=0;
		int bl=0;
		int bh=0;
		int countZero=0;
		for(int i=0;i<arr.length;i++) {
			if(countZero<=m) {
				if(arr[i]==0)
					countZero++;
				h++;
			}
			if(countZero>m) {
				if(arr[l]==0)
					countZero--;
				l++;
			}
			if(h-l>bh && countZero<=m) {
				bh=h-l;
				bl=l;
			}
		}
		for(int i=0;i<bh;i++) {
			if(arr[bl+i]==0)
				System.out.print(bl+i +" ");
		}
		
	}

}
