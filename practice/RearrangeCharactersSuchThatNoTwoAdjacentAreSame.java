package com.ritwika.practice;

import java.util.HashMap;
import java.util.PriorityQueue;

public class RearrangeCharactersSuchThatNoTwoAdjacentAreSame {

	public static void main(String[] args) {
		 String str = "aaabc" ; 
		   System.out.println(rearrangeString(str));
      
        

	}

	private static String rearrangeString(String str) {
		HashMap<Character,Integer> hmap=new HashMap();
		for(int i=0;i<str.length();i++) {
			hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0)+1);
		}
		String res="";
		PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hmap.get(b)-hmap.get(a));
		pq.addAll(hmap.keySet());
		char prev='#';
		hmap.put(prev, -1);
		while(!pq.isEmpty()) {
			char ch=pq.remove();
			res=res+ch;
			hmap.put(ch, hmap.get(ch)-1);
			if(hmap.get(prev)>0)
				pq.add(prev);
			prev=ch;
			
		}
		 if (str.length()!= res.length()) {
			 System.out.println(" Not valid String "); 
			 return "";
		 }
             
		return res;
	}
	

}
