import java.util.ArrayList;

public class MergeBST {
  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
    }
  }

  public static void inorder(Node root, ArrayList<Integer> arr) {
    if (root == null) {
      return;
    }

    inorder(root.left, arr);
    arr.add(root.data);
    inorder(root.right, arr);
  }

  public static Node merge(Node root1, Node root2) {
    // step1
    ArrayList<Integer> arr1 = new ArrayList<>();
    inorder(root1, arr1);

  }

  public static void main(String[] args) {
    Node root1 = new Node(2);
    root1.left = new Node(1);
    root1.right = new Node(4);

    Node root2 = new Node(9);
    root2.left = new Node(3);
    root2.right = new Node(12);
  }
}
