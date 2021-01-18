package com.ritwika.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class OrderOfCharactersInAlienLanguage {
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
			System.out.println("Order Of Characters:");
			while (stck.empty() == false) 
				 System.out.print((char)('a' + stck.pop()) + " "); 
			
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
		String[] words = {"caa", "aaa", "aab"}; 
        printOrder(words, 3); 

	}
	private static void printOrder(String[] words, int n) 
	{
		Graph g=new Graph(n);
		for(int i=0;i<words.length-1;i++) {
			String w1=words[i];
			String w2=words[i+1];
			for(int j=0;j<Math.min(w1.length(),w2.length());j++) {
				if(w1.charAt(j)!=w2.charAt(j)) {
					g.adj[w1.charAt(j)-'a'].add(w2.charAt(j)-'a');
					break;
				}
			}
		}
		   g.TopologicalSort(); 
	}
      

}
