package com.ritwika.practice;

public class TimeRequiredToBurnATreeFromLeafNode {
	public static int res=0;
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.left.left.left = new Node(8); 
        root.left.right.left = new Node(9); 
        root.left.right.right = new Node(10); 
        root.left.right.left.left = new Node(11); 
  
        int target = 11; 
  
        res = 0; 
        getResult(root, new Data(), target); 
        System.out.println(res); 

	}
	static class Node { 
        int data; 
        Node left, right; 
  
        Node(int data) 
        { 
            this.data = data; 
            this.left = null; 
            this.right = null; 
        }
	}
	static class Data { 
        int leftDepth; 
        int rightDepth; 
        boolean contains ; 
        int time; 
        Data() 
        { 
            contains = false; 
            leftDepth = rightDepth = 0; 
            time = -1; 
        } 
	}
	public static void getResult(Node node, Data data, int target) {
		if(node==null)
			return;
		if(node.left==null && node.right==null && node.data==target) {
			data.contains=true;
			data.time=0;
			return;
		}
		Data leftData=new Data();
		getResult(node.left,leftData,target);
		
		Data rightData=new Data();
		getResult(node.right,rightData,target);
		
		data.time=(leftData.contains==true)?leftData.time+1:-1;
		
		if(data.time==-1)
			data.time=(rightData.contains==true)?rightData.time+1:-1;
		
		data.contains=(leftData.contains|| rightData.contains);
		
		data.leftDepth=(node.left==null)?0:(1+Math.max(leftData.leftDepth, leftData.rightDepth));
		
		data.rightDepth=(node.right==null)?0:(1+Math.max(rightData.leftDepth, rightData.rightDepth));
        
		if(data.contains) {
			if(leftData.contains) {
				res=Math.max(res,data.time+data.rightDepth);
			}
			if(rightData.contains) {
				res=Math.max(res,data.time+data.leftDepth);
			}
			
		}
		
		
	}
    

}
