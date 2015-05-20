package com.saftware.tree;

public interface Tree {

	public void traverseInOrder();
	public void traverseUsingRecursion();
	public void bfsTraverse();
	public int size();
	public int size(Node u);
	public boolean hasChild(Node u);
	public int height(Node u);
	public int depth(Node u);
	
}
