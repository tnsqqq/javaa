public class DeleteLeafNodes {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node delete(Node root, int x) {
    if (root == null) {
      return null;
    }

    root.left = delete(root.left, x);
    root.right = delete(root.right, x);

    // If leaf and matches x -> delete it
    if (root.left == null && root.right == null && root.data == x) {
      return null;
    }

    return root;
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(2);
    root.left.right = new Node(2);
    root.right.left = new Node(2);

    inorder(root);
    System.out.println();

    delete(root, 2);
    inorder(root);

  }
}

// Delete leaf nodes with values as x

// Time O(N)
// Space O(H), where H is tree height
