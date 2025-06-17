import java.util.LinkedList;

public class add {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    // step1 - create new node

    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step2 - newNode.next = head
    newNode.next = head; // link

    // step3 - head = newNode
    head = newNode;
  }

  public void addLast(int data) {
    // step1 - create new node

    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step2 - newNode.next = tail
    tail.next = newNode;

    // step3 - tail = newNode
    tail = newNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("Empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }

    Node newNode = new Node(data);
    size++;

    Node temp = head;
    int i = 0;

    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }

    // i = idx - 1; temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("empty");
      return Integer.MIN_VALUE;
    }

    if (size == 1) {
      int val = head.data;
      head = tail = null;
      return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("empty");
      return Integer.MIN_VALUE;
    }

    if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    // prev : i = size-2
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }

    int val = prev.next.data; // tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  public int IterativeSearch(int key) { // O(n)
    Node temp = head;
    int i = 0;

    while (temp != null) {
      if (temp.data == key) {
        return i; // key found
      }

      temp = temp.next;
      i++;

    }

    // key not found
    return -1;

  }

  public int helper(Node head, int key) { // O(n), O(n)
    if (head == null) {
      return -1;
    }

    if (head.data == key) {
      return 0;
    }

    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }

    return idx + 1;

  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  public void reverse() { // O(n)
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    head = prev;
  }

  public void deleteNthNodeFromEnd(int n) {
    // calculate size

    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      size++;
    }

    if (n == size) {
      head = head.next; // removeFirst
      return;
    }

    // size-n
    int i = 1;
    int iToFind = size - n;
    Node prev = head;
    while (i < iToFind) {
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
    return;
  }

  public static void main(String[] args) {
    // LinkedList ll = new LinkedList();
    add ll = new add();

    // ll.print();
    ll.addFirst(2);
    // ll.print();
    ll.addFirst(1);
    // ll.print();
    ll.addLast(4);
    // ll.print();
    ll.addLast(5);
    ll.add(2, 3);

    ll.print();
    ll.deleteNthNodeFromEnd(3);
    ll.print();

    // System.out.println(ll.IterativeSearch(3));
    // System.out.println(ll.IterativeSearch(10));

    // System.out.println(ll.recSearch(2));
    // System.out.println(ll.recSearch(10));

    // System.out.println(ll.size);
    // ll.removeFirst();
    // ll.print();

    // ll.removeLast();
    // ll.print();

    // System.out.println(ll.size);

    // ll.print();

    // ll.reverse();
    // ll.print();

  }
}

// O(n)
