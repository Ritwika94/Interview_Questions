package com.ritwika.practice;

public class MinimumDistanceBetweenWordsOfAString {

	public static void main(String[] args) {
		 String s = "geeks for geeks contribute practice"; 
	        String w1 = "geeks"; 
	        String w2 = "practice"; 
	        System.out.println(distance(s, w1, w2)); 

	}

	private static int distance(String s, String w1, String w2) {
		int minLength=Integer.MAX_VALUE;
		String arr[]=s.split(" ");
		int n=arr.length;
		int prev=-1;
		int i=0;
		for(i=0;i<n;i++) {
			if(arr[i].equals(w1)||arr[i].equals(w2) ) {
				prev=i;
				break;
			}
		}
		
		if(prev==-1)
			return -1;
		for(int j=i+1;j<n;j++) {
			
			
			if(arr[j].equals(w1)||arr[j].equals(w2) ) {
				
				if((!arr[prev].equals(arr[j])) && (j-prev<minLength)) {
					minLength=j-prev-1;
					prev=j;
				}
				else 
				 prev=j;
			}
		}
		
		return minLength;
	}

}
