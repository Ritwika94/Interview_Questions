package com.ritwika.practice;

import java.util.HashMap;

public class RecurringSequenceInAFraction {

	public static void main(String[] args) {
		 int numr = 50, denr = 22;
		  String res = fractionToDecimal(numr, denr);
		  if (res == "")
		    System.out.print("No recurring sequence");
		  else
		    System.out.print("Recurring sequence is " +  res);

	}

	private static String fractionToDecimal(int numr, int denr) {
		HashMap<Integer,Integer> hmap=new HashMap();
		String res="";
		int rem=numr%denr;
		
		if (rem==0)
			return "";
		while(rem!=0) {
						
			if(hmap.containsKey(rem)) {
				int index=hmap.get(rem);
				
				return res.substring(index);
			}
			hmap.put(rem,res.length());
			int temp=rem*10;
			int q=temp/denr;
			rem=temp%denr;
			res+=Integer.valueOf(q);
		
		}
		
		return null;
	}

}
