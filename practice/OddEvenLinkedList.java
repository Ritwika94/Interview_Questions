package com.ritwika.practice;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode oddEvenList(ListNode head) {
	        if(head==null || head.next==null)
	            return head;
	        ListNode odd=head;
	        ListNode even=head.next;
	        ListNode p1=head.next;
	        ListNode p2=head.next;
	        boolean itr=false;
	        while(p1 !=null && p2!=null){
	            if(!itr){
	                odd.next=p2.next;
	                if(odd.next!=null)
	                    odd=odd.next;
	                else
	                    break;
	                
	                    p2=odd.next;
	                
	              
	            }
	            else
	            {
	                p1.next=p2;
	                p1=p1.next;
	            }
	            itr=!itr;
	            
	        }
	      odd.next=even;
	      p1.next=null;
	     return head;
	        
	    }

}
