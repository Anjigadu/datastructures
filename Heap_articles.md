Heap data structure related articles
====================================


+ Binary Heap

  > Complete Binary Tree, implmented using arrays, where root is lesser than left sub tree , right sub tree in all levels for min heap and vice versa for max heap
  
  > operations : insert , extractMin , decreaseKey, delete, minHeapify
  
  > insert : check boundary and insert in last slot and traverse upwards until heap[parent(i)] > heap[i].
  
  > decreaseKey : replace value and traverse upwards until heap[parent(i)] > heap[i].
  
  > minHeapify : **Assumption Left & right sub trees are maitaining heap property. this node has to be modified**
    init smallest = i, checck  smallest between i,lefft,right and if smallest!=i then do swap and recursivley call minHeapify(smallest)
    
  > extractMin : return heap[0] & replace heap[0] with heap[heap_size] , heap_size--; and call minHeapify(0)
  
  > delete : decreaseKey(i,INT_MIN) then extractMin()

+ Why is Binary Heap Preferred over BST for Priority Queue?

  > The above mentioned Operations are performed in same time in self balancing BSTs like AVL tree,Red black tree and Binary Heap.
  
  > But binary heap having advantages like simple implementation, locality of reference due to array based implementation and lower constants.

+ Binomial Heap

+ Fibonacci Heap

+ Heap Sort

+ K’th Largest Element in an array

+ Sort an almost sorted array/

+ Tournament Tree (Winner Tree) and Binary Heap
