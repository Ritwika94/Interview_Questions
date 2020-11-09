package com.ritwika.practice;

import java.util.Stack;

public class NextGreaterElementInAnArray {

	public static void main(String[] args) {
		int arr[] = { 11, 13, 21, 3 }; 
        int n = arr.length; 
        printNextGreater(arr, n);

	}

	private static void printNextGreater(int[] arr, int n) {
		Stack<Integer> stack=new Stack();
		stack.push(arr[0]);
		int i=0;
		for(i=1;i<n;i++) {
			if(stack.isEmpty()) {
				stack.push(arr[i]);
				continue;
			}
			while(!stack.isEmpty() && stack.peek()<arr[i]) {
				int temp=stack.pop();
				System.out.println(temp+"->"+arr[i]);
			}
			stack.push(arr[i]);
			
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+"->"+"-1");
		}
	}

}
