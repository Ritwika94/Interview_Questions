package com.ritwika.practice;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceBetweenTwoCellsInAMatrix {
	static class QItem{
		int x;
		int y;
		int dist;
		QItem(int x,int y,int dist){
			this.x=x;
			this.y=y;
			this.dist=dist;
		}
	}
	public static void main(String[] args) {
		 char grid[][] = { { '0', '*', '0', 's' }, 
                 { '*', '0', '*', '*' }, 
                 { '0', '*', '*', '*' }, 
                 { 'd', '*', '*', '*' } }; 

		 System.out.println("Shortest distance between source and destination is:"+
		 minDistance(grid)); 
		 


	}

	private static int minDistance(char[][] grid) {
		QItem source=new QItem(0,0,0);

		int r=grid.length;
		int c=grid[0].length;
		boolean[][] visited=new boolean[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(grid[i][j]=='0')
					
					visited[i][j]=true;
				else
					visited[i][j]=false;
		}
	}
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(grid[i][j]=='s') {
						source.x=i;
					    source.y=j;
					}
				}		
	}
	Queue<QItem> q=new LinkedList<QItem>();
	q.add(source);
	while(!q.isEmpty()) {
		QItem qitem=q.remove();
		if(grid[qitem.x][qitem.y]=='d')
			return qitem.dist;
		
		if(isSafe(qitem.x+1,qitem.y,visited,r,c)) {
			
			QItem temp=new QItem(qitem.x+1,qitem.y,qitem.dist+1);
			q.add(temp);
			visited[qitem.x+1][qitem.y]=true;
		}
		if(isSafe(qitem.x-1,qitem.y,visited,r,c)) {
			
			QItem temp=new QItem(qitem.x-1,qitem.y,qitem.dist+1);
			q.add(temp);
			visited[qitem.x-1][qitem.y]=true;
		}
		if(isSafe(qitem.x,qitem.y+1,visited,r,c)) {
			
			QItem temp=new QItem(qitem.x,qitem.y+1,qitem.dist+1);
			q.add(temp);
			visited[qitem.x][qitem.y+1]=true;
		}
		if(isSafe(qitem.x,qitem.y-1,visited,r,c)) {
			
			QItem temp=new QItem(qitem.x,qitem.y-1,qitem.dist+1);
			q.add(temp);
			visited[qitem.x][qitem.y-1]=true;
		}
	}
		return -1;
	}

	private static boolean isSafe(int x, int y, boolean[][] visited, int r, int c) {
	
		return (x>=0 && x<r && y>=0 && y<c && visited[x][y]==false);
	}
	

}
