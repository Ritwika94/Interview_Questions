package com.ritwika.practice;

public class PanagramCheck {

	public static void main(String[] args) {
		  String str = "The quick brown fox jumps over the lazy dog"; 
		  
	        if (checkPangram(str) == true) 
	            System.out.print(str + " is a pangram."); 
	        else
	            System.out.print(str + " is not a pangram.");

	}

	private static boolean checkPangram(String str) {
		int arr[]=new int[26];
		int index=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			    index=str.charAt(i)-'a';
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			    index=str.charAt(i)-'A';
			arr[index]++;
		}
		
		for(int i=0;i<26;i++) {
			if(!(arr[i]>0))
				return false;
		}
		return true;
		
		
	}

}
