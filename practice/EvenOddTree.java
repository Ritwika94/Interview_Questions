package com.ritwika.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class EvenOddTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 static HashMap<Integer, List<Integer>> hmap=new HashMap();
	    public boolean isEvenOddTree(TreeNode root) {
	        Queue<TreeNode> q=new LinkedList<TreeNode>();
	        q.add(root);
	        int level=-1;
	        while(q.size()!=0){
	            int size=q.size();
	            level++;
	            
	            while(size>0){
	                TreeNode temp1=q.remove();
	                if(hmap.get(level)==null){
	                     List<Integer> temp=new ArrayList();
	                     temp.add(temp1.val);
	                     hmap.put(level,temp);
	                }
	               else{
	                     List<Integer> temp=hmap.get(level);
	                    temp.add(temp1.val);
	                    hmap.put(level,temp);
	               }
	                    
	                if(temp1.left!=null)
	                     q.add(temp1.left);
	                 if(temp1.right!=null)
	                            q.add(temp1.right);
	                   size--; 
	                }
	            }
	    
	    for(Map.Entry<Integer, List<Integer>> entry:hmap.entrySet()){
	             List<Integer> alist=entry.getValue();
	              int key=entry.getKey();
	       
	            double sum=0;
	           if(key==0 && alist.get(0)%2==1){
	               continue;
	           }
	            if(key==0 && alist.get(0)%2==0){
	               return false;
	           } 
	            if(key%2==0){
	                int i=0;
	                if(alist.size()==1 &&alist.get(0)%2==0 ){
	                    return false;
	                 } 
	             
	                for(i=0;i<alist.size()-1;i++){
	                  
	                    if(alist.get(i)% 2==1 && alist.get(i+1)% 2==1 &&                                                        alist.get(i)<alist.get(i+1))
	                        continue;
	                    else
	                        break;
	                }
	                if(i==alist.size()-1)
	                    continue;
	                else
	                    return false;
	            }
	         else if(key%2==1){
	              if(alist.size()==1 &&alist.get(0)%2==1 ){
	                    return false;
	                 } 
	             
	                int i=0;
	                for(i=0;i<alist.size()-1;i++){
	                    
	                    if(alist.get(i)% 2==0 && alist.get(i+1)% 2==0 &&                                                        alist.get(i)>alist.get(i+1))
	                        continue;
	                    else
	                        break;
	                }
	                if(i==alist.size()-1)
	                    continue;
	                else
	                    return false;
	            }
	        }
	        return true;
	    }

}
