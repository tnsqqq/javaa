import java.util.*;

public class Insert {

  static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
      // add at last index
      arr.add(data);

      int x = arr.size() - 1; // x is child index
      int par = (x - 1) / 2; // par index / parent of x

      while (arr.get(x) < arr.get(par)) { // O(logn)
        // swap
        int temp = arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par, temp);
      }
    }

    public int peek() {
      return arr.get(0);
    }
  }

  public static void main(String[] args) {

    Heap heap = new Heap();

    heap.add(10);
    heap.add(5);
    heap.add(20);
    System.out.println(heap.arr);
    System.out.println(heap.peek());

  }
}
