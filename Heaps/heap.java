public class heap {

}

// Binary Tree
// at most 2 children

// Complete Binary Tree
// CBT is a BT in which all the levels are completely filled except
// possible the last one, which is filled from the left to right.

// Heap Order Property
// Children >= Parent(minHeap)
// Children <= Parent(maxHeap)

// tree: parent-child (minheap par<=child)
// AL: CBT

// (node) idx = i
// leftchild = 2i + 1
// rightchild = 2i + 2

// 2
// / \
// 3 4
// / \
// 5 10

// idx i = 0
// left = 2x0+1 = 1
// right = 2x0+2 = 2

// idx i = 1 (3)
// left = 2x1+1 = 3
// right = 2x1+2 = 4

// arr.add(val/data) add in last

// add/insert -> tree(last pos)

// nodes(tree): O(n) worst case
// (n nodes)

// Heaps not as classes

// Heaps as an array/arraylist

// add -> O(logn)

// Insert in Heap

// child given find parent-
// child -> par
// (x) (x-1)/2

// parent given find child-
// i
// leftchild = 2i + 1
// rightchild = 2i + 2

// 1.add at last index
// 2.fix heap: par = x-1/2 = 5-1/2 = 2
// if(child val < par val) -> swap(child, par)