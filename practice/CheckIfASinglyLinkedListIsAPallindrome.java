package com.ritwika.practice;

import java.util.Stack;

public class CheckIfASinglyLinkedListIsAPallindrome {
	static class Node {
	    int data;
	    Node next;
	    Node(int d)
	    {
	    	next = null;
	        data = d;
	    }
	}
	public static void main(String[] args) {
		 Node one = new Node(1);
	        Node two = new Node(2);
	        Node three = new Node(3);
	        Node four = new Node(4);
	        Node five = new Node(3);
	        Node six = new Node(2);
	        Node seven = new Node(1);
	        one.next = two;
	        two.next = three;
	        three.next = four;
	        four.next = five;
	        five.next = six;
	        six.next = seven;
	        boolean condition = isPalindrome(one);
	        System.out.println("isPalidrome :" + condition);

	}
	private static boolean isPalindrome(Node head) {
		Stack<Integer> stck=new Stack();
		Node temp=head;
		int c=0;
		while(temp!=null) {
			stck.push(temp.data);
			temp=temp.next;
			c++;
		}
		
		temp=head;
		int k=0;
		while(k<=c/2) {
			int x=stck.pop();
			if(x==temp.data) {
				temp=temp.next;
				k++;
				continue;
			}
			else
				break;
			
		}
		
		if(k>c/2)
			return true;
		return false;
	}

}
