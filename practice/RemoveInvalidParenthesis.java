package com.ritwika.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveInvalidParenthesis {

	public static void main(String[] args) {
		String expression = "()())()"; 
	    removeInvalidParenthesis(expression); 
	  
	    expression = "()v)"; 
	    removeInvalidParenthesis(expression); 

	}

	private static void removeInvalidParenthesis(String str) {
		HashSet<String> visited=new HashSet();
		Queue<String> q=new LinkedList();
		q.add(str);
		boolean found=false;
		while(!q.isEmpty()) {
			String s=q.poll();
			if(isValid(s)) {
				System.out.println(s);
				found=true;
			}
			if(found)
				continue;
			for(int i=0;i<s.length();i++) {
				if(!(s.charAt(i)=='(' ||s.charAt(i)==')'))
					continue;
				String temp=s.substring(0,i)+s.substring(i+1);
				if(!visited.contains(temp)) {
					q.add(temp);
					visited.add(temp);
				}
			}
			
		}
		
	}

	private static boolean isValid(String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				c++;
			if(s.charAt(i)==')')
				c--;
			  if (c < 0) 
		            return false; 
		}
		return (c==0);
	}

}
