// valid bst
// 1. inorder traversal is sorted .
// 2. check if max value in left subtree < node and min value in right subtree >
// node.

public class ValidateBST {
  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
    }
  }

  public static boolean isValid(Node root, Node min, Node max) {
    if (root == null) {
      return true;
    }

    if (min != null && root.data <= min.data) {
      return false;
    }

    else if (max != null && root.data >= max.data) {
      return false;
    }

    return isValid(root.left, min, root) && isValid(root.right, root, max);

  }

  public static void main(String[] args) {
    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right.right = new Node(11);
    root.right.right.right = new Node(14);

    if (isValid(root, null, null)) {
      System.out.println("Valid");
    } else {
      System.out.println("Not Valid");
    }
  }
}