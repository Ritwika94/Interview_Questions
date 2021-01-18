package com.ritwika.practice;

import java.util.HashSet;
import java.util.TreeSet;

public class FindUnionAndIntersectionOfTwoUnsortedArrays {

	public static void main(String[] args) {

        int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };
 
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);
 
        System.out.println(
            "Intersection of two arrays is : ");
        printIntersection(arr1, arr2);

	}

	private static void printUnion(int[] arr1, int[] arr2) {
		TreeSet<Integer> h1=new TreeSet();
		for(int i=0;i<arr1.length;i++)
			h1.add(arr1[i]);
		for(int i=0;i<arr2.length;i++)
			h1.add(arr2[i]);
		
		System.out.println(h1);
		
		
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		HashSet<Integer> h1=new HashSet();
		HashSet<Integer> h2=new HashSet();
		for(int i=0;i<arr1.length;i++)
			h1.add(arr1[i]);
		for(int i=0;i<arr2.length;i++)
		{
			if(h1.contains(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
		
		
		
	}

}
