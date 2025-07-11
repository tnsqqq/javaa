public class Univalued {

  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static boolean check(Node root) {
    if (root == null) {
      return true;
    }

    boolean left = check(root.left);
    boolean right = check(root.right);

    if (root.left != null && root.left.data != root.data) {
      return false;
    }

    if (root.right != null && root.right.data != root.data) {
      return false;
    }

    return left && right;

  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(1);
    root.right = new Node(1);
    root.left.left = new Node(1);
    root.left.right = new Node(1);

    System.out.println(check(root));
  }
}

// Check if a Binary Tree is univalued or not

// Complexity Value
// Time O(N)
// Space O(H) where H is the tree height
