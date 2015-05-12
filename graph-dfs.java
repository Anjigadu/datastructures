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
	
	
	public static void BFS(int src,Graph graph){
	
	HashMap<Integer,Integer> level = new HashMap<Integer,Integer>();
	HashMap<Integer,Integer> parent = new HashMap<Integer,Integer>();
	ArrayList<Integer> frontier = new ArrayList<Integer>();
	frontier.add(src);
	level.put(src,0);
	parent.put(src,-1); // -1 represents none
	int i=1;
	while (frontier.size()>0){
	ArrayList<Integer> next = new ArrayList<Integer>();	
		for(Integer u : frontier){
		
		VertexList adjList =graph.adjArray[u];
				Vertex v = adjList.getHead();
				while(v!=null)
		{
			if(level.get(v.getVertexID())==null){
				level.put(v.getVertexID(),i);
				parent.put(v.getVertexID(),u);
				next.add(v.getVertexID());
			}
			v = v.getNext();
		}
		}
		frontier = next;
		i+=1;
	}
	
	System.out.println("With respect to "+src);
	for(int j=0;j<graph.V;j++){
		System.out.println(j+"th node level "+level.get(j)+" parent "+parent.get(j));
	}
	
}
}


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Graph graph = new Graph();
		graph.createGraph(5);
		graph.addEdge(1,2);
		graph.addEdge(2,4);
		graph.addEdge(1,3);
		graph.addEdge(3,4);
		graph.printEdges();
		Graph.BFS(1,graph);
	}
}
