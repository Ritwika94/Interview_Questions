package com.ritwika.practice;

public class SegmentTree {
	int [] st;
	public SegmentTree(int[] arr, int n) {
		int h=(int) Math.ceil(Math.log(n)/Math.log(2));
		int size=2*(int) (2*Math.pow(2, h))-1;
		st=new int[size];
		constructTree(arr,0,n-1,0);
	}

	private int constructTree(int[] arr, int ss, int se, int si) {
		if(ss==se) {
			st[si]=arr[ss];
			return arr[ss];
		}
		int mid=ss+(se-ss)/2;
		st[si]=constructTree(arr,ss,mid,2*si+1)+constructTree(arr,mid+1,se,2*si+2);
		return st[si];
		
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 7, 9, 11}; 
        int n = arr.length; 
        SegmentTree  tree = new SegmentTree(arr, n); 
  
        System.out.println("Sum of values in given range = " + 
                           tree.getSum(n, 1, 3)); 
  
        // Update: set arr[1] = 10 and update corresponding segment 
        // tree nodes 
        tree.updateValue(arr, n, 1, 10); 
  
        // Find sum after the value is updated 
        System.out.println("Updated sum of values in given range = " + 
                tree.getSum(n, 1, 3)); 

	}

	private void updateValue(int[] arr, int n, int i, int val) {
		if(i<0 || i>n-1)
			return;
		
		int diff=val-arr[i];
		arr[i]=val;
		
		updateValueUtil(0,n-1,i,diff,0);
		
	}

	private void updateValueUtil(int ss, int se, int i, int diff, int si) {
		if(i<ss || i>se)
			return;
		st[si]=st[si]+diff;
		if(ss!=se) {
			int mid= ss+(se-ss)/2;
			updateValueUtil(ss,mid,i,diff,2*si+1);
			updateValueUtil(mid+1,se,i,diff,2*si+2);
		}
		
	}

	private int getSum(int n, int qs, int qe) {
		if(qs>qe || qs<0 || qe>n-1)
			return -1;
		return getSumUtil(0,n-1,qs,qe,0);
	}

	private int getSumUtil(int ss, int se, int qs, int qe, int si) {
		if(ss>qe || se<qs)
		return 0;
		if(ss>= qs && se<=qe)
			return st[si];
		
		int mid=ss+(se-ss)/2;
		
		return getSumUtil(ss,mid,qs,qe,2*si+1)+getSumUtil(mid+1,se,qs,qe,2*si+2);
		
	}

}
