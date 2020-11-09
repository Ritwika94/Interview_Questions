package com.ritwika.practice;

public class MinimumWindowSustring {
	private static int NO_OF_CHARS=256;
	public static void main(String[] args) {
		System.out.println(minWindow("ADOBECODEBANC","ABC"));

	}
	public static String minWindow(String s, String t) {
		int sarr[]=new int[NO_OF_CHARS];
		int tarr[]=new int[NO_OF_CHARS];
		if(s.length()<t.length()) {
			return null;
		}
		for(int i=0;i<t.length();i++) {
			tarr[t.charAt(i)]++;
		}
		int count=0;
		int start=0;
		int minLength=Integer.MAX_VALUE;
		int start_index=-1;
		for(int j=0;j<s.length();j++) {
			sarr[s.charAt(j)]++;
		
			if(tarr[s.charAt(j)]!=0 && sarr[s.charAt(j)]<=tarr[s.charAt(j)]) 
				count++;
			
			if(count==t.length()) {
				
				while(sarr[s.charAt(start)]> tarr[s.charAt(start)] 
						|| tarr[s.charAt(start)]==0) {
					
					if(sarr[s.charAt(start)]>tarr[s.charAt(start)]) {
						sarr[s.charAt(start)]--;
					}
					start++;
				}
				int length=j-start+1;
				if(minLength>length) {
					minLength=length;
					start_index=start;
				}
			}
		}
	
		if(start_index==-1)
			return "";
		
		return s.substring(start_index,start_index+minLength);
		
	}

}
