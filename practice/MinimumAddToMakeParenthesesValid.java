package com.ritwika.practice;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {

	public static void main(String[] args) {
		System.out.println(minAddToMakeValid("()))(("));

	}
	  public static int minAddToMakeValid(String S) {
	        if(S==null)
	            return 0;
	       Stack<Character> stck=new Stack();
	        int count=0;
	        for(int i=0;i<S.length();i++){
	            if(S.charAt(i)=='(')
	                stck.push('(');
	            else if(S.charAt(i)==')'){
	               
	                if(!stck.isEmpty() &&stck.peek()=='(')
	                    stck.pop();
	                 else{
	                     count++;
	                 }
	                  
	            }
	        }
	        count+=stck.size();
	        return count;
	        
	    }

}
