package com.saftware.tree.bst;



public class BinaryNode {

	int value;
	BinaryNode parent;
	BinaryNode left;
	BinaryNode right;
	
	public BinaryNode(int value){
		this.value = value;
		this.parent = null;
		this.left = null;
		this.right = null;
	}

}
