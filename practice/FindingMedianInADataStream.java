package com.ritwika.practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindingMedianInADataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 PriorityQueue<Integer> minheap;
     PriorityQueue<Integer> maxheap;
  
  public FindingMedianInADataStream() {
        minheap=new PriorityQueue<>();
        maxheap=new PriorityQueue<>(Comparator.reverseOrder());
  }
  
  public void addNum(int num) {
      minheap.offer(num);
      maxheap.offer(minheap.poll());
      if(minheap.size()<maxheap.size())
          minheap.offer(maxheap.poll());
     
  }
  
  public double findMedian() {
      if(minheap.size()>maxheap.size())
          return minheap.peek();
      
      return  (minheap.peek()+ maxheap.peek())/2.0;
      
  }

}
