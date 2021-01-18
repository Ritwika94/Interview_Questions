package com.ritwika.practice;

import java.util.ArrayList;

public class FindAllSubsequencesWithSumEqualToK {
	static ArrayList<ArrayList<Integer>> ans=new ArrayList();
	public static void main(String[] args) {
		int arr[] = {5, 12, 3, 17, 1, 
                18, 15, 3, 17};
   int k = 6;
   
   subSequenceSum(arr, 
       new ArrayList<Integer>(), k, 0);
        
   // Loop to print the subsequences
   for(int i = 0; i < ans.size(); 
    i++){
       for(int j = 0; 
         j < ans.get(i).size(); j++){
           System.out.print(
               ans.get(i).get(j));
           System.out.print(" ");
       }
       System.out.println();
   }
}

	private static void subSequenceSum( int[] arr, ArrayList<Integer> temp,
			int k, int start) {
		if(k<0 || start>arr.length)
			return;
		
		if(k==0) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for(int i=start;i<arr.length;i++) {
			temp.add(arr[i]);
			subSequenceSum(arr,temp,k-arr[i],i+1);
			temp.remove(temp.size()-1);
		}
		
	}



}
