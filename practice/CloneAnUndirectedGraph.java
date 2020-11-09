package com.ritwika.practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class CloneAnUndirectedGraph {
	static class GraphNode 
	{ 
	    int val; 
	  
	    Vector<GraphNode> neighbours; 
	    public GraphNode(int val) 
	    { 
	        this.val = val; 
	        neighbours = new Vector<GraphNode>(); 
	    } 
	}
	 public GraphNode cloneGraph(GraphNode source) {
		 Queue<GraphNode> q=new LinkedList();
		 q.add(source);
		 HashMap<GraphNode,GraphNode> hmap=new  HashMap();
		 hmap.put(source, new GraphNode(source.val));
		 while(!q.isEmpty()) {
			 GraphNode temp=q.poll();
			 GraphNode clonedNode=hmap.get(temp);
			
			 if(temp.neighbours!=null) {
				 for(GraphNode node:temp.neighbours) {
					 if(hmap.get(node)==null) {
						 q.add(node);
						hmap.put(node, new  GraphNode(node.val));
					 }
					 clonedNode.neighbours.add(node);
				 }
				
			 }
		 }
		return hmap.get(source);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
