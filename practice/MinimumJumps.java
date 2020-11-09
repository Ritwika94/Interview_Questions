package com.ritwika.practice;

public class MinimumJumps {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }; 
        int size = arr.length; 
        System.out.println("Minimum number of"
                           + " dp to reach end is " + minJumps(arr, size)); 

	}
	 private static int minJumps(int[] arr, int n) 
	    { 
	        // jumps[n-1] will hold the 
	        int jumps[] = new int[n]; 
	        // result 
	        int i, j; 
	  
	        // if first element is 0, 
	        if (n == 0 || arr[0] == 0) 
	            return Integer.MAX_VALUE; 
	       
	  
	        jumps[0] = 0; 
	  
	    
	        for (i = 1; i < n; i++) { 
	            jumps[i] = Integer.MAX_VALUE; 
	            for (j = 0; j < i; j++) { 
	                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE)
	                  { 
	                    jumps[i] = Math.min(jumps[i], jumps[j] + 1); 
	                    
	                } 
	            } 
	        } 
	        return jumps[n - 1]; 
	    } 
	  

}
