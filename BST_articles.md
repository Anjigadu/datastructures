Binary Search Tree related articles
===================================
    
* Search and Insert in BST

> traverse the tree recursively and insert in leaf(root=null) create new node
    
* Deletion from BST

> 1. no child free node,
2. one child copy the child to root and empty the child 
3. two childs, find inorder successor(min(right_sub_tree)) / inorder predesor(max(left_sub_tree) and replace the value with root and remove that node recursively
    
* Minimum value in a Binary Search Tree

> go left most node until not empty
    
* Inorder predecessor and successor for a given key in BST

> If present max of left = predesor and min of right = succesor , else whenever making branch keep the previous value as predessor / successor as applicable
    
* Check if a binary tree is BST or not

>  Approach 1: start with func(root,int_min,int_max) & check whether the node's value lies between min & max and recursively call
    func(root->left,min,root->key-1) && func(root->right,root->key+1,max)
    
> Approach 2: Do in order traversal keep prev node value and check whether the node's value is greater than previous value always. 

* Lowest Common Ancestor in a Binary Search Tree.

* Sorted order printing of a given array that represents a BST

* Inorder Successor in Binary Search Tree

* Find k-th smallest element in BST (Order Statistics in BST)

* K’th smallest element in BST using O(1) Extra Space

* Print BST keys in the given range

* Sorted Array to Balanced BST

* Find the largest BST subtree in a given Binary Tree

* Check for Identical BSTs without building the trees

* Add all greater values to every node in a given BST

* Remove BST keys outside the given range

* Check if each internal node of a BST has exactly one child

* Find if there is a triplet in a Balanced BST that adds to zero

* Merge two BSTs with limited extra space

* Two nodes of a BST are swapped, correct the BST

* Construct BST from given preorder traversal | Set 1

* Construct BST from given preorder traversal | Set 2

* Floor and Ceil from a BST

* Convert a BST to a Binary Tree such that sum of all greater keys is added to every key

* Sorted Linked List to Balanced BST

* In-place conversion of Sorted DLL to Balanced BST

* Find a pair with given sum in a Balanced BST

* Total number of possible Binary Search Trees with n keys

* Merge Two Balanced Binary Search Trees

* Binary Tree to Binary Search Tree Conversion

* Transform a BST to greater sum tree

* Inorder predecessor and successor for a given key in BST

* K’th Largest Element in BST when modification to BST is not allowed

* How to handle duplicates in Binary Search Tree?

* Print Common Nodes in Two Binary Search Trees

* Construct all possible BSTs for keys 1 to N
