package com.ritwika.practice;

public class JosephusProblem {

	public static void main(String[] args) {
		int n = 5; 
		int k = 2; 
		System.out.println("The chosen place is " + josephus(n, k)); 

	}

	private static int josephus(int n, int k) {
		 if (n == 1) 
	            return 1; 
	        else
	        {
	        	System.out.println((josephus(n - 1, k) 
	                       + k-1) % n+1);
	        	 return (josephus(n - 1, k) 
	                       + k-1) % n+1 ; 
	        }
	           
	}

}
