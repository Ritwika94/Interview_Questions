package com.ritwika.practice;

import java.util.Vector;

public class MinimumSwapsForBracketBalancing {

	public static void main(String[] args) {
		String s = "[]][][";
	    System.out.println(swapCount(s));
	  
	    s = "[[][]]";
	    System.out.println(swapCount(s));

	}

	private static int swapCount(String s) {
		char S[]=s.toCharArray();
		Vector<Integer> vec=new Vector<>();
		for(int i=0;i<s.length();i++) {
			if(S[i]=='[')
				vec.add(i);
		}
		int count=0;
		int sum=0;
		int p=0;
		for(int i=0;i<s.length();i++) {
			if(S[i]=='[') {
				++count;
				++p;
			}
			else if(S[i]==']') {
				--count;
			
			}
			if(count<0) {
				sum+=vec.get(p)-i;
				char temp=S[i];
				S[i]=S[vec.get(p)];
				S[vec.get(p)]=temp;
				++p;
				count=1;
			}
		}
		return sum;
	}

}
