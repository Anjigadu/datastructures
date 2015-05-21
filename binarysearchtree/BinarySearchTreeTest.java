package com.saftware.tree.bst;

public class BinarySearchTreeTest {

	public static void main(String args[]){
		BinaryNode root = new BinaryNode(10);
		BinarySearchTree tree = new BinarySearchTree(root);
		tree.addNode(5);
		tree.addNode(6);
		tree.addNode(3);
		tree.addNode(2);
		System.out.println(tree.search(2).parent.value);
		System.out.println(tree.deleteChild(3));
		System.out.println(tree.deleteChild(12));
		System.out.println(tree.search(3));
	}
}
