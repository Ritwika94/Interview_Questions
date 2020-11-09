package com.ritwika.practice;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		System.out.println(increasingTriplet(nums));

	}
	  public static boolean increasingTriplet(int[] nums) {
	        if(nums.length==0 || nums==null)
	            return false;
	        int n=nums.length;
	        int smaller[]=new int[n];
	        int greater[]=new int[n];
	        
	        smaller[0]=-1;
	        greater[n-1]=-1;
	        int min=0;
	        int max=n-1;
	        for(int i=1;i<n;i++){
	            if(nums[i]<=nums[min]){
	                min=i;
	                smaller[i]=-1;
	            }
	            else
	                smaller[i]=min;
	        }
	         for(int i=n-2;i>=0;i--){
	            if(nums[i]>=nums[max]){
	                max=i;
	                greater[i]=-1;
	            }
	            else
	                greater[i]=max;
	        }
	         for(int i=1;i<n;i++){
	             if(smaller[i]!=-1 && greater[i]!=-1)
	                 return true;
	         }
	        
	        return false;
	    }
}
