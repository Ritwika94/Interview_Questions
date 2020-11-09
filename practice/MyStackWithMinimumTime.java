package com.ritwika.practice;

import java.util.Stack;

public class MyStackWithMinimumTime {
	 Stack<Integer> s=new Stack();
	 Integer minEle; 
	public static void main(String[] args) {
		MyStackWithMinimumTime s = new MyStackWithMinimumTime(); 
        s.push(3); 
        s.push(5); 
        s.getMin(); 
        s.push(2); 
        s.push(1); 
        s.getMin(); 
        s.pop(); 
        s.getMin(); 
        s.pop(); 
        s.peek(); 

	}

	private void peek() {
		if(s.isEmpty()) {
			System.out.println("No element");
			return;
		}
		int k=s.peek();
		if(k>minEle)
			 System.out.println("Element at top:"+k);
		else
			 System.out.println("Element at top:"+minEle);
		
	}

	private void pop() {
		if(s.isEmpty()) {
			System.out.println("No pop");
			return;
		}
		int k=s.pop();
		if(k<minEle) {
			System.out.println("Element removed:"+minEle); 
			minEle=2*minEle-k;
		}
		else
			System.out.println("Element removed:"+k); 
			
		
	}

	private void getMin() {
		if(s.isEmpty()) {
			System.out.println("No min");
		}
		else {
			System.out.println("Minimum Element:"+minEle);
		}
		
		
	}

	private void push(int i) {
		if(s.isEmpty()) {
			s.push(i);
			minEle=i;
			System.out.println("Number Inserted: " + i); 
			return;
		}
		if(i>s.peek()) {
			s.push(i);
		}
		else {
			s.push(2*i-minEle);
			minEle=i;
		}
		System.out.println("Number Inserted: " + i); 
	}

}
