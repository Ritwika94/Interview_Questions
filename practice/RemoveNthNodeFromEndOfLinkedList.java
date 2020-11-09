package com.ritwika.practice;

public class RemoveNthNodeFromEndOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head==null)
	            return null;
	        if (head.next==null && n==1)
	            return null;
	        ListNode temp=head;
	        int count=0;
	        while(temp!=null){
	            count++;
	            temp=temp.next;
	        }
	        temp=head;
	        for(int i=1;i<count-n+1;i++)
	           temp=temp.next;
	      
	        if(temp.next!=null){
	            ListNode curr=temp.next;
	            temp.val=curr.val;
	            temp.next=curr.next;
	        }
	        else
	        {
	            ListNode temp2=head;
	            while(temp2.next!=temp)
	                temp2=temp2.next;
	            temp2.next=null;
	        }
	       
	      
	        return head;
	        
	    }

}
