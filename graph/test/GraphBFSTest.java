package com.saftware.graph.test;

import com.saftware.graph.Graph;
import com.saftware.graph.Vertex;

public class GraphBFSTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(5);
		
		Vertex v0 = new Vertex(0);
		Vertex v1= new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		
		v0.addAdjVertex(v1);
		v0.addAdjVertex(v2);
		
		v1.addAdjVertex(v0);
		v1.addAdjVertex(v3);
		
		v2.addAdjVertex(v0);
		v2.addAdjVertex(v4);
		
		v3.addAdjVertex(v1);
		v3.addAdjVertex(v4);
		
		v4.addAdjVertex(v3);
		v4.addAdjVertex(v2);
		
		g.addVertex(0, v0);
		g.addVertex(1, v1);
		g.addVertex(2, v2);
		g.addVertex(3, v3);
		g.addVertex(4, v4);
		
		Graph.BFSTraverse(v0, g);
	}

}
