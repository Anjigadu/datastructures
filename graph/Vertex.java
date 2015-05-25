package com.saftware.graph;


import java.util.LinkedList;
import java.util.List;

public class Vertex {

	private int vertexId; 
	List<Vertex> adjList = null ;
	
	public Vertex(int vertexId){
		this.vertexId = vertexId;
		adjList = new LinkedList<Vertex>();
	}
	public Vertex(int vertexId,List<Vertex> adjList){
		this.vertexId = vertexId;
		this.adjList = adjList;
	}
	
	public int getVertexId(){
		return this.vertexId;
	}
	
	public List<Vertex> getAdjList(){
		return this.adjList;
	}
	public void setAdjList(List<Vertex> adjList){
		this.adjList =adjList;
	}
	public void addAdjVertex(Vertex adjVertex){
		this.adjList.add(adjVertex);
	}
	@Override
	public String toString() {
		return "Vertex [vertexId=" + vertexId + "]";
	}
	
	
}
