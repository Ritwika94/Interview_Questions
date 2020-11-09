package com.ritwika.practice;

public class DistinctAnagrams {

	public static void main(String[] args) {
		  char str[] = {'A', 'B', 'B'}; 
	        int n = str.length; 
	        findPermutations(str, 0, n); 

	}

	private static void findPermutations(char[] str, int index, int n) {
		  if (index >= n) { 
	            System.out.println(str); 
	            return; 
	        }
		  
		for(int i=index;i<n;i++) {
			 boolean check = shouldSwap(str, index, i); 
	            if (check) {
	            	
	            		swap(str,index,i);
	            		System.out.println(index+1);
	            		findPermutations(str,index+1,n);
	            		swap(str,index,i);
	            }
		}
		
		
	}
	private static boolean shouldSwap(char[] str, int index, int curr) {
		
		for(int i=index;i<curr;i++) {
			if(str[i]==str[curr])
				return false;
		}
		return true;
	}

	static void swap(char[] str, int i, int j) { 
        char c = str[i]; 
        str[i] = str[j]; 
        str[j] = c; 
    } 

}
