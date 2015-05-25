package com.saftware.graph;

import java.util.HashMap;

public class GraphDFSTraverser {

	HashMap<Vertex,Vertex> parent =new HashMap<Vertex, Vertex>();
	
	public void DFSTraverse(Graph g){
		
		for (Vertex s : g.vArray){
			if(parent.get(s)==null){
				parent.put(s, new Vertex(-1));
				DFSVisit(s);
			}
		}
		
		for(int i=0;i<g.n;i++){
			Vertex u = g.getVertex(i);
			System.out.println("Vertex: "+u);
			System.out.println("PAretn: "+parent.get(u));
		}
	}
	
	private void DFSVisit(Vertex v){
		for(Vertex u : v.adjList){
			if(parent.get(u)==null){
				parent.put(u,v);
				DFSVisit(u);
			}
			
		}
	}

}
