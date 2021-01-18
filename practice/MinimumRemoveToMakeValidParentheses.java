package com.ritwika.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {

	public static void main(String[] args) {
	System.out.println(minRemoveToMakeValid("(a(b(c)d)"));

	}
	
	public static String minRemoveToMakeValid(String s) {
        StringBuilder S=new StringBuilder();
        if(s==null)
            return s;   
        Set<Integer> indexesToRemove = new HashSet<>();
             
       Stack<Integer> stck=new Stack();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stck.push(i);
            else if(s.charAt(i)==')'){
               
                if(!stck.isEmpty())
                    stck.pop();
               else
                   indexesToRemove.add(i);
                  
            }
        }
        
        while(!stck.isEmpty()){
            indexesToRemove.add(stck.pop());
        }
        
         for(int i=0;i<s.length();i++){
             if(!indexesToRemove.contains(i))
                 S.append(s.charAt(i));
         }
      
      
        return S.toString();
        
    }

}
