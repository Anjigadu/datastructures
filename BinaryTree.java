package com.saftware.tree;

import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.*;
public class BinaryTree implements Tree{

	private Node r;

	public BinaryTree(Node r){
		this.r = r;
		
	}
	/**
	 * This method will traverse all the nodes in the tree recursively in order
	 * (current-->left-->right)
	 * 
	 */
	public void traverseUsingRecursion() {
		Node u = this.r;
		traverseUsingRecursion(u);
		
	}
	
	private void traverseUsingRecursion(Node u){
		if(u==null)
			return;
		else{
			out.println(u.value);
			traverseUsingRecursion(u.left);
			traverseUsingRecursion(u.right);
		}
	}
	
	/**
	 * This method will also traverse the tree in order but instead of recursion this will use the loop
	 * Since using recursion will not scale out for tree with huge size
	 * (current->left->right) 
	 * Check the previous pointer, then decide from where it came to current node. If from parent then go to left then right
	 * else if it came from left then to right else to parent.
	 */
	public void traverseInOrder() {
		Node u = this.r,prev = null,next;
		while(u!=null){
			
			if(prev==u.parent){
				out.println(u.value);
				if(u.left!=null) next = u.left;
				else if (u.right!=null) next = u.right;
				else next = u.parent;
			}else if(prev==u.left){
				if (u.right!=null) next = u.right;
				else next = u.parent;
			}else{
				next = u.parent;
			}
			
			prev = u;
			u = next;
		}
		
	}
	
	/**
	 * This method is used to traverse the tree in bfs manner.
	 * ie. from root, visit nodes at each nodes level by level.
	 * For this we're using Queue.
	 */
	public void bfsTraverse() {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(this.r);
		while(!queue.isEmpty()){
			Node u = queue.remove();
			out.println(u.value);
			if(u.left!=null) queue.add(u.left);
			if(u.right!=null) queue.add(u.right);
		}
	}

	/**
	 * This method will recursively compute the size of the tree(ie. number of nodes in the tree)
	 * return numberofNodes
	 */
	public int size() {
		Node  u = this.r;
		return size(u);
	}
	
	/**
	 * This method will recursively compute the size of the given node(ie. number of nodes in the tree)
	 * return numberofNodes in the sub tree
	 */
	public int size(Node u) {
		
		if(u!=null){
			return 1 + size(u.left)+ size(u.right); 
			
		}else{
			return 0;
		}
	}
	
	/**
	 * This method to check whether the Node has Child or Not
	 * 
	 */
	public boolean hasChild(Node u) {
		
		if(u!=null && (u.left!=null || u.right!=null)){
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * This method calculate the height of the Node recursively
	 * Height of Node defined as the maximum length of the path to leaf child.
	 * 
	 */
	public int height(Node u) {
		if(u==null){
			return -1;
		}else{
			return 1+ Math.max(height(u.left),height(u.right));
		}
		
	}
	
	/**
	 * This method is used to find the depth (ie. number of nodes in the path between root and this node).
	 */
	public int depth(Node u) {
		int n=1;
		while(u!=this.r){
			u = u.parent;
			n++;
		}
		return n;
	}
	
}

