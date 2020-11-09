package com.ritwika.practice;

public class RecursivelyRemoveAllDuplicates {

	public static void main(String[] args) {
		String str1 = "geeksforgeeg"; 
        System.out.println(remove(str1));

	}

	private static String remove(String str) {
		char last_removed='\0';
		return removeUntil(str,last_removed);
	}

	private static String removeUntil(String str, char last_removed) {
		if(str.length()==0 || str.length()==1)
			return str;
		if(str.charAt(0)==str.charAt(1)) {
			last_removed=str.charAt(0);
			while(str.length()>0 && str.charAt(0)==str.charAt(1))
				str=str.substring(1,str.length());
			str=str.substring(1,str.length());
			return removeUntil(str,last_removed);
			
		}
		String rem=removeUntil(str.substring(1,str.length()),last_removed);
		
		if(rem.length()!=0 && rem.charAt(0)==str.charAt(0)) {
			last_removed=str.charAt(0);
			return rem.substring(1, rem.length());
		}
		if(rem.length()==0 && last_removed==str.charAt(0))
			return rem;
		return str.charAt(0)+rem;
	}

}
