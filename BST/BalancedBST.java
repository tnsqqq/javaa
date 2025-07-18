import java.util.ArrayList;

public class BalancedBST {
  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
    }
  }

  public static void getInoder(Node root, ArrayList<Integer> inorder) {
    if (root == null) {
      return;
    }

    getInoder(root.left, inorder);
    inorder.add(root.data);
    getInoder(root.right, inorder);
  }

  public static Node balanceBST(Node root) {
    // inorder seq
    ArrayList<Integer> inorder = new ArrayList<>();
    getInoder(root, inorder);\

    // sorted inorder -> balanced BST

  }

  public static void main(String[] args) {

  }
}
