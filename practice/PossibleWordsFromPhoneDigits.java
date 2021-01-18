package com.ritwika.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PossibleWordsFromPhoneDigits {
	static Character[][] numberToCharMap;
	public static void main(String[] args) {
		 int number[] = {2, 3, 4};
		  List<String> strList=printWords(number);
		
		  for(String s:strList) {
			  System.out.print(s+" ");
		  }

	}

	private static List<String> printWords(int[] number) {
		generateAMap();
		return  getWords(number,number.length,0,"");
		 
	}

	private static List<String> getWords(int[] number, int len, int numIndex, String s) {
		if(len==numIndex) {
			return new ArrayList<String>(Collections.singleton(s));
		}
		ArrayList<String> alist=new ArrayList<>();
		for(int i=0;i<numberToCharMap[number[numIndex]].length;i++) {
			String str=s.copyValueOf(s.toCharArray());
			String strCopy=str.concat(numberToCharMap[number[numIndex]][i].toString());
			alist.addAll(getWords(number,len,numIndex+1,strCopy));
		}
		return alist;
	}

	private static void generateAMap() {
		 numberToCharMap = new Character[10][5];
		  numberToCharMap[0] = new Character[]{'\0'};
		  numberToCharMap[1] = new Character[]{'\0'};
		  numberToCharMap[2] = new Character[]{'a','b','c'};
		  numberToCharMap[3] = new Character[]{'d','e','f'};
		  numberToCharMap[4] = new Character[]{'g','h','i'};
		  numberToCharMap[5] = new Character[]{'j','k','l'};
		  numberToCharMap[6] = new Character[]{'m','n','o'};
		  numberToCharMap[7] = new Character[]{'p','q','r','s'};
		  numberToCharMap[8] = new Character[]{'t','u','v'};
		  numberToCharMap[9] = new Character[]{'w','x','y','z'};
		
	}

}
