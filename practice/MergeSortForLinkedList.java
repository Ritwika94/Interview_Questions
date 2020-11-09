package com.ritwika.practice;

public class MergeSortForLinkedList {
	
	   
	    static class ListNode { 
	        int val; 
	        ListNode next; 
	  
	        public ListNode(int val) 
	        { 
	            this.val = val; 
	        } 
	    }
	    ListNode head = null; 
	public static void main(String[] args) {
		MergeSortForLinkedList li = new MergeSortForLinkedList(); 
	      
	        li.push(15); 
	        li.push(10); 
	        li.push(5); 
	        li.push(20); 
	        li.push(3); 
	        li.push(2); 
	        System.out.print("Linked List before sorting:"); 
	        li.printList(li.head); 
	        System.out.println();
	        li.head = li.mergeSort(li.head); 
	        System.out.print("Linked List after sorting:"); 
	        li.printList(li.head); 

	}
	void push(int new_data) 
    { 
       ListNode new_node = new ListNode(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
  
    void printList(ListNode headref) 
    { 
        while (headref != null) { 
            System.out.print(headref.val + " "); 
            headref = headref.next; 
        } 
    } 
	
	private ListNode mergeSort(ListNode head) {
		if(head==null || head.next==null)
			return head;
		ListNode middle=findMiddle(head);
		
		ListNode nextofmiddle = middle.next; 
		middle.next = null; 
		ListNode left=mergeSort(head);
		ListNode right=mergeSort(nextofmiddle);
		ListNode sortedList=sortedMerge(left,right);
	
		return sortedList;
	}

	private ListNode sortedMerge(ListNode a, ListNode b) {
		ListNode res=null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		if(a.val<=b.val) {
			res=a;
			res.next=sortedMerge(a.next,b);
		}
		else if(a.val>=b.val) {
			res=b;
			res.next=sortedMerge(a,b.next);
		}
		return res;
	}
	private ListNode findMiddle(ListNode head) {
		if(head==null)
			return head;
		ListNode slow=head;
		ListNode fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	
}
