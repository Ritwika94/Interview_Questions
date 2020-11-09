package com.ritwika.practice;

public class LexicographicallySmallestAndLargestSubstringOfSizeK {

	public static void main(String[] args) {
		 String str = "GeeksForGeeks"; 
	     int k = 3; 
	     getSmallestAndLargest(str, k); 

	}

	private static void getSmallestAndLargest(String str, int k) {
		String currStr = str.substring(0,k);
		String lexLargest=currStr;
		String lexSmallest=currStr;
		
		for(int i=k;i<str.length();i++) {
			currStr=currStr.substring(1,k)+str.charAt(i);
			if(currStr.compareTo(lexLargest)>0)
				lexLargest=currStr;
			if(currStr.compareTo(lexSmallest)<0)
				lexSmallest=currStr;
			
		}
		System.out.println("LexicoGraphically smallest substring of size k:"+lexSmallest);
		System.out.println("LexicoGraphically largest substring of size k:"+lexLargest);
		
	}

}
