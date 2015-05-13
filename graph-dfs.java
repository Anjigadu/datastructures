/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Vertex{
	
	private int vertexID;
	private Vertex next;
	public Vertex(int id){
		this.vertexID = id;
		this.next = null;
	}
	public int getVertexID(){
		return this.vertexID;
	}
	public Vertex getNext(){
		return this.next;
	}
	public void setNext(Vertex next){
		this.next = next;
	}
}

class VertexList{
	
	private Vertex head;
	public VertexList(){
		
		head = null;
	}
	public Vertex getHead(){
		return this.head;
	}
	public void setHead(Vertex head){
		this.head = head;
	}
}

class Graph{
	public int V;
	public VertexList adjArray[];
	
	public void createGraph(int V){
		this.V = V;
		this.adjArray = new VertexList[V];
		for(int i=0;i<this.V;i++){
			this.adjArray[i] = new VertexList();
		}
	}

	public void addEdge(int src,int dest){
		
		VertexList adjList = this.adjArray[src];
		Vertex vertex = new Vertex(dest);
		vertex.setNext(adjList.getHead());
		adjList.setHead(vertex);
	}
	public void printEdges(){
		
		for(int i=0;i<this.V;i++){
		System.out.print(i);
			VertexList adjList = this.adjArray[i];
				Vertex current = adjList.getHead();
				while(current!=null){
					System.out.print("-->"+current.getVertexID());
					current = current.getNext();
				}
			
			System.out.println("");
		}	
		
	}
	
}

class DFSTraverser{


	private HashMap<Integer,Integer> parent = new HashMap<Integer,Integer>();

	public void DFS(Graph graph){
	
		for(int i=0;i< graph.V;i++){
		
			if(parent.get(i)==null){
				parent.put(i,-1); // -1 represents none
				DFSVisit(i,graph);
			}
	
		}
	
	
		for(int j=0;j<graph.V;j++){
		System.out.println(j+"th parent "+parent.get(j));
		}
	
	}	
	public void DFSVisit(int src,Graph graph){
		VertexList vList = graph.adjArray[src];
		
		Vertex v = vList.getHead();
		
		while(v!=null){
		if(parent.get(v.getVertexID())==null){
			parent.put(v.getVertexID(),src);
			DFSVisit(v.getVertexID(),graph);
		}
		v = v.getNext();
		}
	}

}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Graph g = new Graph();
		g.createGraph(5);
		g.addEdge(0, 1);
    	g.addEdge(0, 2);
    	g.addEdge(1, 2);
    	g.addEdge(2, 0);
    	g.addEdge(2, 3);
    	g.addEdge(3, 3);
		g.printEdges();
		new DFSTraverser().DFS(g);
	}
}
