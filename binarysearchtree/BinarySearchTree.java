package com.saftware.tree.bst;

public class BinarySearchTree {

	public BinaryNode r;
	
	public BinarySearchTree(BinaryNode r){
		this.r = r;
	}
	
	/**
	 * The addNode method is used to add the new Node into the Binary Search Tree
	 * and by ensuring the Binary Search property
	 * First find the Parent Node  for the child can be added.
	 * And then create child Node and attach with Parent
	 * @param x
	 * @return whether added or not.
	 */
	public boolean addNode(int x){
		
		BinaryNode p = findLast(x);
		BinaryNode child =  new BinaryNode(x);
		return addChild(p,child);
		
	}
	
	
	/**
	 * Add child Node to parent with bst property
	 * @param p
	 * @param child
	 * @return
	 */
	private boolean addChild(BinaryNode p, BinaryNode child) {
		
		if(child.value < p.value){
			p.left = child;
		}else if(child.value > p.value){
			p.right = child;
		}else{
			return false;
		}
		child.parent = p;
		return true;
	}

	
	/**
	 * Used to find the last node to which value x can be added
	 * @param x
	 * @return
	 */
	private BinaryNode findLast(int x) {
		BinaryNode u = this.r,p=null;
		while(u!=null){
			if(u.value > x){
				p = u;
				u = u.left;
			}else if(u.value < x){
				p = u;
				u = u.right;
			}else{
				return u;
			}
		}
		return p;
	}

	/**
	 * THis method is used to find the Node with value x in the Binary Search Tree
	 * @param x
	 * @return
	 */
	public BinaryNode search(int x){
		BinaryNode u = this.r;
		while(u!=null){
		if(u.value < x){
			u = u.right;
		}else if(u.value > x){
			u = u.left;
		}else{
			return u;
		}
		}
		return null;
		
	}
	
	
	public boolean deleteChild(int x){
		BinaryNode u = this.search(x);
		if(u==null)
			return false;
		else{
			if(u.left==null || u.right==null)
				splice(u);
			else{
				BinaryNode w = u.right;
				while(w.left!=null){
					w = w.left;
				}
				u.value = w.value;
				splice(w);
			}
			return true;
		}
		
	}
	
	public void splice(BinaryNode u){
		BinaryNode s,p;
		if(u.left!=null)
			s = u.left;
		else
			s = u.right;
		
		p = u.parent;
		if(u==this.r){
			this.r = s;
		}else{
			if(u==p.left)
				p.left = s;
			else
				p.right = s;
			if(s!=null)
				s.parent = p;
		}
		
	}
}
