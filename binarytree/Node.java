package com.saftware.tree;

public class Node {


	String value;
	Node parent;
	Node left;
	Node right;

	public Node(String value){
		this.value = value;
		this.parent = null;
		this.left = null;
		this.right = null;
	}

	public Node(String value,Node u){
		this.value = value;
		this.parent = u;
		this.left = null;
		this.right = null;
	}
	
	public boolean addAsLeftChild(Node l){
		this.left = l;
		l.parent = this;
		return true;
	}
	
	public boolean addAsRightChild(Node r){
		this.right = r;
		r.parent = this;
		return true;
	}
}
