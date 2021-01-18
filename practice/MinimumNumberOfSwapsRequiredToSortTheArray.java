package com.ritwika.practice;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumNumberOfSwapsRequiredToSortTheArray {

	public static void main(String[] args) {

        int[] a
            = { 101, 758, 315, 730, 472, 
                        619, 460, 479 };
        int n = a.length;
        
        System.out.println(minSwaps(a, n));

	}
	public static int minSwaps(int[] arr, int N)
	{
		int res=0;
		
		HashMap<Integer,Integer> hmap=new HashMap();
		for(int i=0;i<N;i++) {
			hmap.put(arr[i], i);
		}
		int temp[]=Arrays.copyOfRange(arr, 0, N);
		Arrays.sort(temp);
		for(int i=0;i<N;i++) {
			if(arr[i]!=temp[i]) {
				int val=arr[i];
				res++;
				swap(arr,i,hmap.get(temp[i]));
				hmap.put(val, hmap.get(temp[i]));
				hmap.put(temp[i],i);
			}
		}
		return res;
		
	}
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
 

}
