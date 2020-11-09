package com.ritwika.practice;

public class ContainerWithMpstWater {

	public static void main(String[] args) {
		
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));

	}
	 public static int maxArea(int[] height) {
	        int l=0;
	        int h= height.length-1;
	        int area=0;
	        while(l<h){
	            area=Math.max(area, Math.min(height[l],height[h])*(h-l));
	        
	        if(height[l]<height[h])
	            l++;
	        else
	           h--;
	        }
	         return area;
	    }

}
