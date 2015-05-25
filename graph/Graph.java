package com.saftware.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Graph {

	int n;
	Vertex vArray[];
	public Graph(int n){
		this.n = n;
		vArray = new Vertex[n];
	}
	
	public void addVertex(int i,Vertex v){
		this.vArray[i] = v;
	}
	
	public Vertex[] getVertexArray(){
		return this.vArray;
	}
	
	public Vertex getVertex(int i){
		return this.vArray[i];
	}
	
	
	/**
	 * Breadth First Search is used to traverse the graph from the source vertext s
	 * by checking level by level from the source vertex. O(V+E)
	 * 
	 * @param s
	 * @param g
	 */
	public static void BFSTraverse(Vertex s,Graph g){
		
		HashMap<Vertex,Integer> level = new HashMap<Vertex, Integer>();
		HashMap<Vertex,Vertex> parent = new HashMap<Vertex, Vertex>();
		
		//init s Vertex
		level.put(s, 0);
		parent.put(s, null);
		Set<Vertex> frontier = new HashSet<Vertex>();
		frontier.add(s);
		int i=1;
		while(!frontier.isEmpty()){
			Set<Vertex> next = new HashSet<Vertex>();
			Iterator<Vertex> fIterator = frontier.iterator();
			while(fIterator.hasNext()){
				Vertex u = fIterator.next();
				for(Vertex v : u.adjList){
					if(level.get(v)==null){
						level.put(v, i);
						parent.put(v, u);
						next.add(v);
					}
				}
			}
			frontier = next;
			i++;
		}
		
		for(int j=0;j<g.n;j++){
			Vertex v =g.getVertex(j);
			System.out.println("For vertex: "+v);
			System.out.println("level :"+level.get(v));
			System.out.println("parent: "+parent.get(v));
		}
		
		
	}
}
