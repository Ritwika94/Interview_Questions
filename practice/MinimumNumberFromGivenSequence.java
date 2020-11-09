package com.ritwika.practice;

import java.util.ArrayList;

public class MinimumNumberFromGivenSequence {

	public static void main(String[] args) {
		 printLeast("IDID");  
         printLeast("I");  
         printLeast("DD");  
         printLeast("II");  
         printLeast("DIDI");  
         printLeast("IIDDD");  
         printLeast("DDIDDIID");  

	}

	private static void printLeast(String str) {
		ArrayList<Integer> alist=new ArrayList();
		int posOfI=0;
		int min=0;
		int n=str.length();
		if(str.charAt(0)=='D') {
			alist.add(2);
			alist.add(1);
			min=3;
			posOfI=0;
		}
		if(str.charAt(0)=='I') {
			alist.add(1);
			alist.add(2);
			min=3;
			posOfI=1;
		}
		for(int i=1;i<n;i++) {
			if(str.charAt(i)=='I') {
				alist.add(min);
				min=min+1;
				posOfI=i+1;
			}
			if(str.charAt(i)=='D') {
				alist.add(alist.get(i));
				for(int j=posOfI;j<=i;j++) {
					alist.set(j, alist.get(j)+1);
				min++;
				}
			}
			
		}
		
		for(int val:alist)
			System.out.print(val);
		System.out.println();
		
	}

}
