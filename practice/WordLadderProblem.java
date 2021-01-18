package com.ritwika.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadderProblem {

	public static void main(String[] args) {
		 Set<String> D = new HashSet<String>(); 
		    D.add("poon"); 
		    D.add("plee"); 
		    D.add("same"); 
		    D.add("poie"); 
		    D.add("plie"); 
		    D.add("poin"); 
		    D.add("plea"); 
		    String start = "toon"; 
		    String target = "plea"; 
		    System.out.print("Length of shortest chain is: "
		        + shortestChainLen(start, target, D)); 

	}
	public static int shortestChainLen(String start,String target,Set<String> D) {
		if(!D.contains(target))
			return 0;
		int level=0;
		int len=start.length();
		Queue<String> q=new LinkedList();
		q.add(start);
		while(!q.isEmpty()) {
			++level;
			int size=q.size();
			for(int i=0;i<q.size();i++) {
				char word[]=q.peek().toCharArray();
				q.remove();
				for(int pos=0;pos<len;pos++) {
					char temp=word[pos];
					for(char c='a';c<='z';c++) {
						word[pos]=c;
						if(String.valueOf(word).equals(target))
							return level+1;
						if(!D.contains(String.valueOf(word)))
							continue;
						D.remove(String.valueOf(word));
						q.add(String.valueOf(word));
					}
					word[pos]=temp;
					
				}
			}
	}
return 0;
	}
            
            

}
