package com.ritwika.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class EvaluateDivision {
	static class Node 
    { 
        String val;
        int state;
        Map<Node,Double> neighbors;
        Node(String val){
        	this.val=val;
        	this.state=0;
        	this.neighbors=new HashMap<>();
        }
    } 
  
   static class  Graph{
	   HashMap<String,Node> nodeMap;
	  Graph(){
		  this.nodeMap=new HashMap<>();
	  }
	public void buildGraph(List<List<String>> equations, double[] values) {
		int i=0;
		for(List<String> list:equations) {
			String s1=list.get(0);
			String s2=list.get(1);
			double val=values[i];
			i=i+1;
			if(!nodeMap.containsKey(s2)) {
				nodeMap.put(s2, new Node(s2));
			}
			if(!nodeMap.containsKey(s1)) {
				nodeMap.put(s1, new Node(s1));
			}
			
			nodeMap.get(s1).neighbors.put(nodeMap.get(s2), val);
			nodeMap.get(s2).neighbors.put(nodeMap.get(s1), (1.0/val));
			
		}
		
		
	}
	public void resetStates() {
		for(String s:nodeMap.keySet())
			nodeMap.get(s).state=0;
		
	}
  }
	public static void main(String[] args) {
		List<List<String>> equations=new ArrayList();
		List<String> al1=new ArrayList();
		al1.add("a");
		al1.add("b");
		List<String> al2=new ArrayList();
		al2.add("b");
		al2.add("c");
		equations.add(al1);
		equations.add(al2);
		double[] values= {2.0,3.0};
		List<List<String>> queries=new ArrayList();
		List<String> al3=new ArrayList();
		al3.add("a");
		al3.add("c");
		queries.add(al3);
		double[]arr=calcEquation(equations,values,queries);
		for(double val:arr)
			System.out.println(val);

	}

 public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
	Graph graph=new Graph();
	graph.buildGraph(equations,values);
	int i=0;
	double[] ans=new  double[queries.size()];
	for(List<String> list:queries) {
		Node n1=graph.nodeMap.get(list.get(0));
		Node n2=graph.nodeMap.get(list.get(1));
		ans[i]=dfs(n1,n2,1.0);
		i++;
		graph.resetStates();
	}
	 
	 return ans;
	 
 }

private static double dfs( Node start, Node end,double product) {
	if(start==null || end==null) {
		return -1;
	}
	if(start.val==end.val) {
		return product;
	}
	start.state=1;
	
	 for(Node node:start.neighbors.keySet()) {
		 if(node.state==0) {
			 double result=dfs(node,end,product*start.neighbors.get(node));
			 if(result!=-1)
				 return result;
		 }
	 }
	start.state=2;
	return -1;
	 
}

}

