package com.ritwika.practice;

public class MinimumCostToConnectRopes {
	static int[] harr; 
	static  int heap_size;  
	static  int capacity;
	public static void main(String[] args) {
		 int len[] = { 8, 4, 6, 12 }; 
	        int size = len.length; 
	  
	        System.out.println("Total cost for connecting ropes is " + minCost(len, size)); 
	    
	}
	private static int minCost(int[] len, int size) {
		int count=0;
		buildMinHeap(len,size);
		while(!checkSize()) {
			int first=extractMin();
			int second=extractMin();
			count+=(first+second);
			insertInHeap(first+second);
			
		}
		return count;
	}
	private static void insertInHeap(int val) {
		if (heap_size == capacity) { 
            
            return; 
        } 
  
        
        heap_size++; 
        int i = heap_size - 1; 
        harr[i] = val; 
  
        while (i != 0 && harr[parent(i)] > harr[i]) { 
            swap(i, parent(i)); 
            i = parent(i); 
        } 
    } 
		
	private static int parent(int i) {
		// TODO Auto-generated method stub
		return (i-1)/2;
	}

	
	private static boolean checkSize() {
		  return (heap_size == 1);
	}
	private static int extractMin() {
		if(heap_size<=0)
			return Integer.MIN_VALUE;
		if (heap_size == 1) { 
            heap_size--; 
            return harr[0]; 
        } 
		int temp=harr[0];
		harr[0]=harr[heap_size-1];
		heap_size--;
		meanHeapify(0);
		return temp;
	}
	private static void buildMinHeap(int[] len, int size) {
		harr=len;
		heap_size = size; 
        capacity = size; 
        for(int i=(heap_size-1)/2;i>=0;i--) {
        	meanHeapify(i);
        }
		
	}
	private static void meanHeapify(int i) {
		int l = 2*i+1; 
        int r = 2*i+2; 
        int smallest = i; 
        if (l < heap_size && harr[l] < harr[i]) 
            smallest = l; 
        if (r < heap_size && harr[r] < harr[smallest]) 
            smallest = r; 
        if (smallest != i) { 
            swap(i, smallest); 
            meanHeapify(smallest); 
        } 
		
	}
	
    static  void swap(int x, int y) 
    { 
        int temp = harr[x]; 
        harr[x] = harr[y]; 
        harr[y] = temp; 
    }

	

}
