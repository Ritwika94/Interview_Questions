package com.ritwika.practice;

import java.util.Arrays;
import java.util.LinkedList;

public class NoOfConnectedComponentsInAnUndirectedGraph {
	static class Graph{
		int V;
		LinkedList<Integer> arr[];
		Graph(int V){
			this.V=V;
			this.arr=new LinkedList[V];
			for(int i=0;i<V;i++) {
				arr[i]=new LinkedList<Integer>();
			}
			
		}
		void addEdge(int u,int v) {
			arr[u].add(v);
			arr[v].add(u);
		}
		public int connectedComponents() {
			int visited[]=new int[V];
			int count=0;
			for(int i=0;i<V;i++)
				visited[i]=0;
			for(int i=0;i<V;i++) {
				if(visited[i]==0) {
					dfs(i,visited);
					count++;
				}
			}
			return count;
		}
		private void dfs(int i, int[] visited) {
			visited[i]=1;
			LinkedList<Integer> alist=arr[i];
			for(Integer val:alist) {
				if(visited[val]==0)
					dfs(val,visited);
			}
			
			
		}
	}
	public static void main(String[] args) {

	 Graph g = new Graph(5);   
	 g.addEdge(1, 0);  
     g.addEdge(2, 3);  
     g.addEdge(3, 4); 
     System.out.println("No of connected components is:"+ g.connectedComponents()); 
    
	}

}
