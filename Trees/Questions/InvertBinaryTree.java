public class InvertBinaryTree {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static Node invert(Node root) {
    if (root == null) {
      return null;
    }

    // Swap left and right
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;

    // Recursively invert children
    invert(root.left);
    invert(root.right);

    return root;

  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    invert(root);
    preorder(root);
  }
}

// Invert Binary Tree

// Time Complexity - O(N)
// Space Complexity - O(N)

// Where:
// N = total number of nodes
// H = height of the tree