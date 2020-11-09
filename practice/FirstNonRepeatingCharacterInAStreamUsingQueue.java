package com.ritwika.practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacterInAStreamUsingQueue {

	public static void main(String[] args) {
		String str = "aabc"; 
        firstNonRepeating(str);

	}

	private static void firstNonRepeating(String str) {
		HashMap<Character,Integer> hmap=new HashMap();
		
		Queue<Character> q=new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			q.add(str.charAt(i));
			hmap.put(str.charAt(i),hmap.getOrDefault(str.charAt(i), 0)+1);
			while(!q.isEmpty()) {
				if(hmap.get(q.peek())>1)
					q.remove();
				else {
					System.out.print(q.peek()+" ");
					break;
				}
			}
			if(q.isEmpty())
				System.out.print("-1"+" ");
		}
		
		
	}

}
