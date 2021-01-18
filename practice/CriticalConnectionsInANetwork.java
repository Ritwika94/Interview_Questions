package com.ritwika.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CriticalConnectionsInANetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> res=new ArrayList();
	    public int time=0;
	    public class Graph{
	        int v;
	        LinkedList<Integer> adj[];
	        Graph(int v){
	            this.v=v;
	            adj=new LinkedList[v];
	            for(int i=0;i<v;i++)
	                adj[i]=new LinkedList<>();
	            
	        }
	        
	        public void addEdge(int i,int j){
	            adj[i].add(j);
	            adj[j].add(i);
	        }
	        public void findCriticalConnections() {
				//boolean visited[]=new boolean[v];
				//int parent[]=new int[v];
				
				int low[]=new int[v];
				int disc[]=new int[v];
				for(int i=0;i<v;i++) {
					//visited[i]=false;
					//parent[i]=-1;
	                disc[i]=-1;
					
				}
				for(int i=0;i<v;i++) {
					if( disc[i]==-1)
						findCriticalConnectionsUtil(i,i,low,disc);
				}
	        }
	public void findCriticalConnectionsUtil(int u, int parent, int[]low,int[] disc) {
				//visited[u]=true;
				disc[u]=low[u]=++time;
				
				 Iterator<Integer> i = adj[u].iterator(); 
	        
				while (i.hasNext())  {
	                int v = i.next();
	                if (v == parent) continue;
					if(disc[v]==-1) {
					
						findCriticalConnectionsUtil(v,u,low,disc);
						low[u]=Math.min(low[u],low[v]);
					
						if(low[v]>disc[u]) {
	                        res.add(Arrays.asList(u, v));
						}
					}
					else {
						low[u]=Math.min(low[u],disc[v]);
					}
				}
				
			}
	        
	    }
	    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
	        Graph g=new Graph(n);
	        for(List<Integer> l:connections){
	            int x=l.get(0);
	            int y=l.get(1);
	            g.addEdge(x,y);
	        }
	        
	       g.findCriticalConnections();
	        return res;
	    }

}
