Binary Search Tree related articles
===================================
    
* Search and Insert in BST

    > traverse the tree recursively and insert in leaf(root=null) create new node
    
* Deletion from BST

    > 1. no child free node,
    > 2. one child copy the child to root and empty the child 
    > 3. two childs, find inorder successor(min(right_sub_tree)) / inorder predesor(max(left_sub_tree) and replace the value with root
    and remove that node recursively
    
* Minimum value in a Binary Search Tree

    > go left most node until not empty
    
* Inorder predecessor and successor for a given key in BST

    > If present max of left = predesor and min of right = succesor , else whenever making branch keep the previous value as predessor
    / successor as applicable
    
* Check if a binary tree is BST or not

    >  Approach 1: start with func(root,int_min,int_max) & check whether the node's value lies between min & max and recursively call
    func(root->left,min,root->key-1) && func(root->right,root->key+1,max)
    
    > Approach 2: Do in order traversal keep prev node value and check whether the node's value is greater than previous value always. 

* Lowest Common Ancestor in a Binary Search Tree.

    > Check if root is in between n1 & n2 then root is lca else if n1 & n2 < root , recur left sub tree else recur right sub tree

* Sorted order printing of a given array that represents a BST

* Inorder Successor in Binary Search Tree

    > InOrder successor is min of right sub tree if right sub tree exists,else traverse from rooot and find the last node visited.

* Find k-th smallest element in BST (Order Statistics in BST)

    > Itrerative In order traversal, and do until K number of elements traversed.
    
    > Or use augmented tree, store number of nodes in left sub tree , for each node. & match with node where K = lcount + 1 return

* K’th smallest element in BST using O(1) Extra Space

* Print BST keys in the given range

* Sorted Array to Balanced BST

    > createBST(arr[],start,end)
    
    > Find middle element and create root = arr[mid]
    
    > root->left = createBST(arr[],start,mid-1)
    
    > root->right = createBST(arr[],mid+1,end)

* Find the largest BST subtree in a given Binary Tree

* Check for Identical BSTs without building the trees

* Add all greater values to every node in a given BST

* Remove BST keys outside the given range

* Check if each internal node of a BST has exactly one child

* Find if there is a triplet in a Balanced BST that adds to zero

* Merge two BSTs with limited extra space

    > Do like, inorder traversal with two stacks for each tree

    > If one stack empty, do inorder traversal of other tree and to avoid alreay printed elements make current ->left = NULL

    > else, pop elements form stacks and compare them. whichever less print and set that current as current->right , for the other one
    push back to stack and set that current as NULL so that next time it will be processed


* Two nodes of a BST are swapped, correct the BST

    > Do inorder recursion, maintain prev pointer
 
    > If root->data < prev pointer (in between left & right traversal)
 
    > populate prev as first , root as middle and if they alreay not null then root as last
 
    > swap first & last (if exist) or first & middle

* Construct BST from given preorder traversal | Set 1

* Construct BST from given preorder traversal | Set 2

* Floor and Ceil from a BST

* Convert a BST to a Binary Tree such that sum of all greater keys is added to every key

* Sorted Linked List to Balanced BST

* In-place conversion of Sorted DLL to Balanced BST

* Find a pair with given sum in a Balanced BST

    > Do in order & reverse in order simultaneously
    > compare values whenever value popped out from stack stop and compare, if val1 + val2 = sum, then return true
    > if val1 + val2 < sum, then continue inorder
    > if val1 + val2 > sum, then continue reverse inorder
    
* Total number of possible Binary Search Trees with n keys

* Merge Two Balanced Binary Search Trees

    > In order traversal of tree 1 and store in arr1

    > In order traversal of tree 2 and store in arr2

    > merge two sorted arrays.

    > from sorted array construct balanced bst which takes O(m+n) time.

* Binary Tree to Binary Search Tree Conversion

* Transform a BST to greater sum tree

* Inorder predecessor and successor for a given key in BST

* K’th Largest Element in BST when modification to BST is not allowed

* How to handle duplicates in Binary Search Tree?

* Print Common Nodes in Two Binary Search Trees

* Construct all possible BSTs for keys 1 to N
