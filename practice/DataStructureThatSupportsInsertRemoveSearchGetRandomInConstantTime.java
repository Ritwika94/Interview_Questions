package com.ritwika.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class DataStructureThatSupportsInsertRemoveSearchGetRandomInConstantTime {
	ArrayList<Integer> arr;
	HashMap<Integer, Integer>hmap;
	DataStructureThatSupportsInsertRemoveSearchGetRandomInConstantTime(){
		arr=new ArrayList();
		hmap=new HashMap<>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  void add(int x) {
		if(hmap.get(x)!=null)
			return;
		int s=arr.size();
		arr.add(x);
		hmap.put(x, s);
		
	}
	public  int search(int x) {
		if(hmap.get(x)==null)
			return  -1;
		return hmap.get(x);
		
	}
	public  void remove(int x) {
		if(hmap.get(x)==null)
			return ;
		hmap.remove(x);
		int index=hmap.get(x);
		int temp=arr.get( arr.size()-1);
		Collections.swap(arr, index,  arr.size()-1); 
		arr.remove(arr.size()-1);
		hmap.put(temp,index);
		
		
	}
	
	public  int getRandom() {
		Random rand=new Random();
		int index=rand.nextInt(arr.size());
		return arr.get(index);
	}

}
