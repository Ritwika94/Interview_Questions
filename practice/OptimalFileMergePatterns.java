package com.ritwika.practice;

import java.util.PriorityQueue;

public class OptimalFileMergePatterns {

	public static void main(String[] args) {
	
        int size = 6; 
  
        int files[] = new int[] { 2, 3, 4, 5, 6, 7 }; 
  
        System.out.println("Minimum Computations = "
                           + minComputation(size, files));

	}

	private static int minComputation(int size, int[] files) {
		PriorityQueue<Integer> pq=new PriorityQueue();
		int count=0;
		
		for(int x:files)
			pq.add(x);
		while(pq.size()!=2) {
			int temp=pq.poll()+pq.poll();
			count+=temp;
			pq.add(temp);
		}
		count+=pq.poll()+pq.poll();
		return count;
	}

}
