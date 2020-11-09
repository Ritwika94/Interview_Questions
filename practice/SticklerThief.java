package com.ritwika.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SticklerThief {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());	
			while(t>0){
			int n=Integer.parseInt(br.readLine());
			int arr[]=new int[n];
			String str=br.readLine();
			String arr2[]=str.split(" ");
			for(int i=0;i<n;i++){
			    arr[i]=Integer.parseInt(arr2[i]);
			}
			int temp[]=new int[n+1];
	    	for(int i=0;i<n;i++){
			    temp[i]=arr[i];
			}
			temp[0]=0;
			temp[1]=arr[0];
			for(int i=2;i<=n;i++){
				temp[i]=Math.max(temp[i-1], temp[i-2]+arr[i-1]);
			}
			System.out.println(temp[n]);
			t--;
			}

	}

}
