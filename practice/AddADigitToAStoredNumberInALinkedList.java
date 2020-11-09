package com.ritwika.practice;

import java.util.LinkedList;

public class AddADigitToAStoredNumberInALinkedList {
	static class node  
	{ 
	    int key; 
	    node next; 
	  
	    node(int n)  
	    { 
	        key = n; 
	        next = null; 
	    } 
	}; 
	static node head=null;
	 void insert(node n) 
	    { 
        if (head == null) 
	            head = n; 
        else
	        { 
	            n.next = head; 
	            head = n; 
	        } 
	    } 
	  
	
	    void printList() 
	    { 
	        node ptr = head; 
	  
	        while (ptr != null)  
	        { 
	            System.out.print(ptr.key); 
	            ptr = ptr.next; 
	        } 
	        System.out.println();
	       
	    }
	public static void main(String[] args)  
    { 
          
     
		AddADigitToAStoredNumberInALinkedList l1 = new AddADigitToAStoredNumberInALinkedList(); 
        l1.insert(new node(9)); 
        l1.insert(new node(9)); 
        l1.insert(new node(1)); 
        System.out.print("Number before addition:");
        l1.printList(); 
        l1.addDigit(5); 
        System.out.print("Number after addition:");
        l1.printList(); 
    }


	private void addDigit(int i) {
	node l=null;
	node curr=head;
	while(curr.next!=null) {
		if(curr.key<9)
			l=curr;
		curr=curr.next;
		
	}
	curr.key+=i;
	if(curr.key>9) {
		curr.key=curr.key%10;
		if(l==null) {
			insert(new node(1));
			l=head.next;
		}
		else {
			while(l!=curr) {
				l.key=(l.key+1)%10;
				l=l.next;
			}
		}
	}
		
	} 
}
