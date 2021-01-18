package com.ritwika.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinimumCharactersToBeremovedToMakeFrequencyOfEachCharacterUnique {

	public static void main(String[] args) {
		 String str = "abbbcccd";

		  int N = str.length();
		  System.out.print(minCntCharDeletionsfrequency( str.toCharArray(), N));
	}
	static int minCntCharDeletionsfrequency(char[] str,  int N) {
	int count = 0;
	HashMap<Character,Integer> hmap=new HashMap();
	for(char c:str) {
		hmap.put(c, hmap.getOrDefault(c, 0)+1);
	}
	PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
	for(char c:str) {
		if(pq.isEmpty()) {
			pq.add(hmap.get(c));
			continue;
		}
		if(hmap.get(c)==pq.peek()) {
			hmap.put(c,hmap.get(c)-1);
			count++;
			pq.add(hmap.get(c));
		}
		else
			pq.add(hmap.get(c));
	}
	return count;
		
}

}
