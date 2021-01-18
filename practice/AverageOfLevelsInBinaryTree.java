package com.ritwika.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageOfLevelsInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  static HashMap<Integer, List<Integer>> hmap=new HashMap();
	    public List<Double> averageOfLevels(TreeNode root) {
	        List<Double> dlist=new ArrayList();
	        average(root,0);
	        
	        for(Map.Entry<Integer, List<Integer>> entry:hmap.entrySet()){
	             List<Integer> temp=entry.getValue();
	            double sum=0;
	            for(Integer x:temp){
	                sum+=x;
	            }
	          
	            double y=sum/temp.size();
	            System.out.println(y);
	            dlist.add(y);
	        }
	        return dlist;
	        
	    }
	    public void average(TreeNode root, int level) {
	        if(root==null)
	            return;
	        if(hmap.get(level)==null){
	            List<Integer> temp=new ArrayList();
	            temp.add(root.val);
	            hmap.put(level,temp);
	        }
	        else{
	             List<Integer> temp=hmap.get(level);
	              temp.add(root.val);
	             hmap.put(level,temp);
	        }
	      
	        average(root.left,level+1);
	         average(root.right,level+1);
	        
	        
	    }

}
