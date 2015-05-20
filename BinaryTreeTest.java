package com.saftware.tree.test;

import com.saftware.tree.BinaryTree;
import com.saftware.tree.Node;
import static java.lang.System.*;
public class BinaryTreeTest {

	public static void main(String args[]){
		
		Node root = new Node("1");
		Node left1 = new Node("2");
		Node right1 = new Node("3");
		Node left2_1 = new Node("4");
		Node right2_1= new Node("5");
		Node left2_2 = new Node("6");
		Node right2_2= new Node("7");
		
		root.addAsLeftChild(left1);
		root.addAsRightChild(right1);
		
		left1.addAsLeftChild(left2_1);
		left1.addAsRightChild(right2_1);
		
		right1.addAsLeftChild(left2_2);
		right1.addAsRightChild(right2_2);
		
		BinaryTree bTree  = new BinaryTree(root);
		
		out.println("Tree size: "+bTree.size());
		out.println("Depth of Leaf: "+bTree.depth(right2_2));
		out.println("Depth of Level 1 node: "+bTree.depth(right1));
		out.println("Height of Root/Tree: "+bTree.height(root));
		
		out.println("BFS Traverse of tree : \n"); bTree.bfsTraverse();
		out.println(" Traverse USing recursion:\n");bTree.traverseUsingRecursion();
		out.println("Traverse Without Recursion: \n");bTree.traverseInOrder();
		
		
	}
}
