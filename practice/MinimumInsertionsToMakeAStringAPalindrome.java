package com.ritwika.practice;

public class MinimumInsertionsToMakeAStringAPalindrome {

	public static void main(String[] args) {
		String str="abcda";
		System.out.println(findMinInsertionsDP(str));

	}
	 static int findMinInsertionsDP(String str) {
		 char arr[]=str.toCharArray();
		 int n=arr.length;
		 int table[][]=new int[n][n];
		 int l,h,gap;
		 for(gap=1;gap<n;++gap) {
			 for(l=0,h=gap;h<n;++h,++l) {
				 table[l][h]=(arr[l]==arr[h])?table[l+1][h-1]:
					 (1+Integer.min(table[l+1][h],table[l][h-1]));
			 }
		 }
		 return table[0][n-1];
		 
		 
	 }

}
