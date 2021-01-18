package com.ritwika.practice;

import java.util.ArrayList;

public class ArticulationPointsInAGraph {
	static int time=0;
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
			adj[j].add(i);
			
		}
		public void findArticulationPoints() {
			boolean visited[]=new boolean[v];
			int parent[]=new int[v];
			boolean ap[]=new boolean[v];
			int low[]=new int[v];
			int disc[]=new int[v];
			for(int i=0;i<v;i++) {
				visited[i]=false;
				parent[i]=-1;
				ap[i]=false;
			}
			for(int i=0;i<v;i++) {
				if(!visited[i])
					APUtil(i,visited,parent,ap,low,disc);
			}
			for(int i=0;i<v;i++) {
				if(ap[i]==true)
					System.out.println(i);
			}
			
		
	}
	private void APUtil(int u, boolean[] visited, int[] parent, boolean[] ap, int[] low, int[] disc) {
			int children=0;
			visited[u]=true;
			disc[u]=low[u]=++time;
			
			ArrayList<Integer> al=adj[u];
			for(Integer v:al) {
				if(!visited[v]) {
					children++;
					parent[v]=u;
					APUtil(v,visited,parent,ap,low,disc);
					low[u]=Math.min(low[u],low[v]);
					if(parent[u]==-1 && children>1)
						ap[u]=true;
					if(parent[u]!=-1 && low[v]>=disc[u]) {
						ap[u]=true;
					}
				}
				else if(v!=parent[u]){
					low[u]=Math.min(low[u],disc[v]);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		 System.out.println("Articulation points in first graph "); 
	        Graph g1 = new Graph(5); 
	        g1.addEdge(1, 0); 
	        g1.addEdge(0, 2); 
	        g1.addEdge(2, 1); 
	        g1.addEdge(0, 3); 
	        g1.addEdge(3, 4); 
	        g1.findArticulationPoints(); 
	       

	}

}
