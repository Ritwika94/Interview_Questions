package com.ritwika.practice;

import java.util.ListIterator;
import java.util.Stack;

public class SortAStackUsingRecursion {
	
	 public static void main(String[] args)  
	    {  
		 Stack<Integer> s = new Stack<>();   
	        s.push(30);  
	        s.push(-5);  
	        s.push(18);  
	        s.push(14);  
	        s.push(-3);  
	      
	       System.out.println("Stack elements before sorting: ");  
	        printStack(s);  
	      
	        sortStack(s);  
	      
	        System.out.println(" \n\nStack elements after sorting:");  
	        printStack(s);  
	      
	    }

	private static void sortStack(Stack<Integer> s) {
		if(!s.isEmpty()) {
			int x=s.pop();
			sortStack(s);
			insertIntoStack(s,x);
		}
		
	}

	private static void insertIntoStack(Stack<Integer> s, int x) {
		if(s.isEmpty() || x<s.peek()) {
			s.push(x);
			return;
		}
		else
		{
			int temp=s.pop();
			insertIntoStack(s,x);
			s.push(temp);
		}
		
		
	}

	private static void printStack(Stack<Integer> s) {
		  ListIterator<Integer> lt = s.listIterator(); 
	     
	       while(lt.hasNext()) 
	           lt.next(); 
	 
	       while(lt.hasPrevious()) 
	           System.out.print(lt.previous()+" "); 
		
	}  

}
