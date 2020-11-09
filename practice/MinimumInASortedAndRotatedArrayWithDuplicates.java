package com.ritwika.practice;

public class MinimumInASortedAndRotatedArrayWithDuplicates {

	public static void main(String[] args) {
		int[] nums= {2,2,2,0,1};
		System.out.println(findMin(nums));

	}
	 public static int findMin(int[] nums) {
		 int h=nums.length-1;
		 int l=0;
		 return findMinEl(nums,l,h);
	 }
	private static int findMinEl(int[] nums, int l, int h) {
		if(l==h)
			return nums[l];
		if(h==l+1)
			return Math.min(nums[l], nums[h]);
		int mid=l+(h-l)/2;
		if(nums[h]>nums[l])
			return nums[l];
		else if(nums[l]==nums[h])
			return findMinEl(nums,l+1,h);
		else if(nums[mid]>=nums[l])
			return findMinEl(nums,mid,h);
		else
			return findMinEl(nums,l,mid);
		
	}

}
