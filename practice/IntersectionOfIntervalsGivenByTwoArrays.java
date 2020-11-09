package com.ritwika.practice;

public class IntersectionOfIntervalsGivenByTwoArrays {
	public static void main(String[] args) {
		int arr1[][] = { { 0, 4 }, { 5, 10 }, 
                { 13, 20 }, { 24, 25 } }; 

		int arr2[][] = { { 1, 5 }, { 8, 12 },  
                { 15, 24 }, { 25, 26 } }; 

		printIntervals(arr1, arr2); 

	}

	private static void printIntervals(int[][] arr1, int[][] arr2) {
	
		int n=arr1.length;
		int m=arr2.length;
		int i = 0,j=0;
		while(i<n && j<m) {
			int start=Math.max(arr1[i][0],arr2[j][0]);
			int end=Math.min(arr1[i][1],arr2[j][1]);
			if(start<=end) {
				System.out.println("{"+start+","+end+"}");
			}
			if(arr1[i][1]<arr2[j][1])
				i++;
			else
				j++;
		}
		
	}
}
