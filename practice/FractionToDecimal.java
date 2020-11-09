package com.ritwika.practice;

import java.util.HashMap;

public class FractionToDecimal {

	public static void main(String[] args) {
		 int num = 50, den = 22; 
		System.out.println(calculateFraction(num, den));

	}

	private static String calculateFraction(int num, int den) {
		int rem=num%den;
		int q=num/den;
		String res="";
		res+=q;
		int sign=0;
		if(num<0 || den<0)
			sign=-1;
		if(sign==-1)
			res+="-";
		if(rem==0)
			return res;
		res+=".";
		int x=res.length();
		HashMap<Integer,Integer> hmap=new HashMap();
		int index=0;
		while(rem!=0) {
			if(hmap.containsKey(rem)) {
				
				index=hmap.get(rem);
				break;
			}
			
			hmap.put(rem, res.length());
			rem=rem*10;
			int temp=rem/den;
			rem=rem%den;
			res+=Integer.toString(temp);
			
		}
		
		return res;
		
		
	}

}
