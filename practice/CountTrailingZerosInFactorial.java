package com.ritwika.practice;

public class CountTrailingZerosInFactorial {

	public static void main(String[] args) {
		 int n = 100; 
	        System.out.println("Count of trailing 0s in " +  
	                                           n +"! is " +  
	                                 findTrailingZeros(n)); 

	}

	private static int findTrailingZeros(int n) {
		int count=0;
		
		for(int i=5;n/i>=1;i=i*i)
			count+=n/i;
		return count;
	}

}
