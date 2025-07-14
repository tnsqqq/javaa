import java.util.*;

public class FindAllDuplicateSubtrees {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
    }
  }

  static Map<String, Integer> map = new HashMap<>();
  static List<Node> result = new ArrayList<>();

  public static String duplicate(Node root) {
    if (root == null) {
      return "#";
    }

    String serial = duplicate(root.left) + "," + duplicate(root.right) + "," + root.data;

    map.put(serial, map.getOrDefault(serial, 0) + 1);
    if (map.get(serial) == 2) {
      result.add(root);
    }

    return serial;
  }

  public static void main(String[] args) {
    // Example tree:
    /*
     * 1
     * / \
     * 2 3
     * / / \
     * 4 2 4
     * /
     * 4
     */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.right.left = new Node(2);
    root.right.right = new Node(4);
    root.right.left.left = new Node(4);

    duplicate(root);

    System.out.println("Duplicate subtrees roots are:");
    for (Node node : result) {
      System.out.println(node.data);
    }
  }
}

// Find All Duplicate Subtrees

// Worst Case-
// Time- O(N^2)
// Space- O(N^2)

// Average Case-
// Time- O(N log N)
// Space- O(N log N)

// Best Case-
// Time- O(N) (perfect duplicate structure)
// Space- O(N)

// class Solution {
// // Use instance variables
// private Map<String, Integer> map = new HashMap<>();
// private List<TreeNode> result = new ArrayList<>();

// public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
// duplicate(root);
// return result;
// }

// private String duplicate(TreeNode root) {
// if (root == null) {
// return "#";
// }

// String serial = duplicate(root.left) + "," + duplicate(root.right) + "," +
// root.val;

// map.put(serial, map.getOrDefault(serial, 0) + 1);
// if (map.get(serial) == 2) {
// result.add(root);
// }

// return serial;
// }
// }
