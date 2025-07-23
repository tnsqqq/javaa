// Delete in Heap

// 1. 1st & last node swap
// 2. remove last idx -> arr.remove(arr.size()-1)
// 3. fix my heap -> heapify

// heapify -> root = i
// left = 2i + 1 = 1
// right = 2i + 2 = 2

// min(i, 2i+1, 2i+2)

// swap with root

import java.util.*;

public class Delete {

  static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
      // add at last index
      arr.add(data);

      int x = arr.size() - 1; // x is child index
      int par = (x - 1) / 2; // par index / parent of x

      while (arr.get(x) > arr.get(par)) { // O(logn) // <
        // swap
        int temp = arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par, temp);

        x = par;
        par = (x - 1) / 2;
      }
    }

    public int peek() {
      return arr.get(0);
    }

    private void heapify(int i) { // O(logn)
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int minIdx = i;

      // int maxIdx = i;

      if (left < arr.size() && arr.get(minIdx) < arr.get(left)) { // >
        minIdx = left;
      }

      if (right < arr.size() && arr.get(minIdx) < arr.get(right)) { // >
        minIdx = right;
      }

      if (minIdx != i) {
        // swap
        int temp = arr.get(i);
        arr.set(i, arr.get(minIdx));
        arr.set(minIdx, temp);

        heapify(minIdx);
      }
    }

    public int remove() {
      int data = arr.get(0);

      // step1 - swap first & last
      int temp = arr.get(0);
      arr.set(0, arr.get(arr.size() - 1));
      arr.set(arr.size() - 1, temp);

      // step2 - delete last
      arr.remove(arr.size() - 1);

      // step3 - heapify
      heapify(0);
      return data;
    }

    public boolean isEmpty() {
      return arr.size() == 0;
    }

  }

  public static void main(String[] args) {

    Heap heap = new Heap();

    heap.add(3);
    heap.add(4);
    heap.add(1);
    heap.add(5);

    // System.out.println(heap.arr);

    while (!heap.isEmpty()) {
      System.out.println(heap.peek());
      heap.remove();
    }
  }
}
