package com.ritwika.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopoLogicalSortInAGraph {
	static class Graph{
		int v;
		ArrayList<Integer> adj[]; 
		Graph(int v){
			this.v=v;
			adj=new ArrayList[v];
			for(int i=0;i<v;i++)
				adj[i]=new ArrayList<Integer>();
		}
		public void addEdge(int i, int j) {
			adj[i].add(j);
			
		}
		public void TopologicalSort() {
			
			boolean visited[]=new boolean[v];
			Arrays.fill(visited, false);
			Stack<Integer> stck=new Stack<Integer>();
			for(int i=0;i<v;i++) {
			
				if(!visited[i]) {
					
					TopologicalSortUtil(stck,visited,i);
				}
					
			}
			System.out.println("Topological Sort:");
			 while (stck.empty() == false) 
		            System.out.print(stck.pop() + " "); 
			
		}
		public void TopologicalSortUtil(Stack<Integer> stck, boolean[] visited, int i) {
			visited[i]=true;
			ArrayList<Integer> l=adj[i];
			
			for(Integer val:l) {
				
				if(!visited[val])
					TopologicalSortUtil(stck,visited,val);
			}
			stck.push(new Integer(i));
		}
	}
	public static void main(String[] args) {
		 Graph g = new Graph(6); 
	        g.addEdge(5, 2); 
	        g.addEdge(5, 0); 
	        g.addEdge(4, 0); 
	        g.addEdge(4, 1); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 1); 
	        g.TopologicalSort(); 

	}

}
