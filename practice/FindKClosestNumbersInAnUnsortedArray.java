package com.ritwika.practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKClosestNumbersInAnUnsortedArray {
	static class Pair 
	{ 
	    Integer key; 
	    Integer value; 
	      
	    public Pair(Integer key, Integer value) 
	    { 
	        this.key = key; 
	        this.value = value; 
	    } 
	    public Integer getKey() 
	    { 
	        return key; 
	    } 
	    public void setKey(Integer key) 
	    { 
	        this.key = key; 
	    } 
	    public Integer getValue() 
	    { 
	        return value; 
	    } 
	    public void setValue(Integer value) 
	    { 
	        this.value = value; 
	    } 
	} 
	public static void main(String[] args) {
		 int arr[] = { -10, -50, 20, 17, 80 };  
		    int x = 20, k = 2;  
		    int n = arr.length; 
		      
		    printKclosest(arr, n, x, k);  

	}

	private static void printKclosest(int[] arr, int n, int x, int k) {
		PriorityQueue<Pair> pq=new PriorityQueue<>(
				new Comparator<Pair>() {
					 public int compare(Pair p1, Pair p2) {
						 return p2.getValue().compareTo(p1.getValue());
					 }
					
				});
		for(int i=0;i<k;i++) {
			pq.offer(new Pair(arr[i], Math.abs(arr[i] - x)));
		}
		for(int i=k;i<n;i++) {
			int diff=Math.abs(arr[i]-x);
			if(diff>pq.peek().getValue())
				continue;
			pq.poll();
			pq.offer(new Pair(arr[i],diff));
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.poll().getKey()+" ");
		}
				
		
	}

}
