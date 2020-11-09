package com.ritwika.practice;

public class MinimumFlipsToMakeBinaryCoinsAlternate {

	public static void main(String[] args) {
		String str = "0001010111"; 
        System.out.println(minFlipToMakeStringAlternate(str));

	}

	private static int minFlipToMakeStringAlternate(String str) {
		return Math.min(mincount(str,'0'), mincount(str,'1'));
		
	}

	private static int mincount(String str, char start) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=start) {
				count++;
		}
			start=flip(start);
		}
		return count;
	}

	private static char flip(char start) {
		if(start=='0')
			return '1';
		return '0';
	}

}
