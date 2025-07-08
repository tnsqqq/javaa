import java.util.*;

public class Height {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // public static int height(Node root) {
  // if (root == null) {
  // return 0;
  // }

  // int lh = height(root.left);
  // int rh = height(root.right);
  // return Math.max(lh, rh) + 1;
  // }

  // public static int count(Node root) {
  // if (root == null) {
  // return 0;
  // }

  // int lc = count(root.left);
  // int rc = count(root.right);
  // return lc + rc + 1;
  // }

  // public static int sum(Node root) {
  // if (root == null) {
  // return 0;
  // }

  // int ls = sum(root.left);
  // int rs = sum(root.right);
  // return ls + rs + root.data;
  // }

  // public static int diameter1(Node root) { // O(n^2) -> height is calculated
  // seperately
  // if (root == null) {
  // return 0;
  // }

  // int ldia = diameter1(root.left);
  // int rdia = diameter1(root.right);

  // int lh = height(root.left);
  // int rh = height(root.right);

  // int selfdia = lh + rh + 1;

  // return Math.max(selfdia, Math.max(ldia, rdia));
  // }

  // static class Info {
  // int d;
  // int ht;

  // public Info(int d, int ht) {
  // this.d = d;
  // this.ht = ht;
  // }
  // }

  // public static Info diameter2(Node root) { // O(n)
  // if (root == null) {
  // return new Info(0, 0);
  // }

  // Info lInfo = diameter2(root.left);
  // Info rInfo = diameter2(root.right);

  // int d = Math.max(Math.max(lInfo.d, rInfo.d), lInfo.ht + rInfo.ht + 1);
  // int ht = Math.max(lInfo.ht, rInfo.ht) + 1;
  // return new Info(d, ht);
  // }

  // public static boolean isSubtree(Node root, Node subRoot) {
  // if (root == null) {
  // return false;
  // }
  // if (root.data == subRoot.data) {
  // if (isIdentical(root, subRoot)) {
  // return true;
  // }
  // }
  // // boolean left = isSubtree(root.left, subRoot); // lsubtree -> true
  // // boolean right = isSubtree(root.right, subRoot);

  // // return left || right;

  // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  // }

  static class Info {
    Node node;
    int hd;

    public Info(Node node, int hd) {
      this.node = node;
      this.hd = hd;
    }

  }

  public static void topView(Node root) {

    Queue<Info> q = new LinkedList<>();
    HashMap<Integer, Node> map = new HashMap<>();

    int max = 0, min = 0;
    q.add(new Info(root, 0));
    // q.add(null);

    while (!q.isEmpty()) {
      Info curr = q.remove();
      // if (curr == null) {
      // if (q.isEmpty()) {
      // break;
      // } else {
      // q.add(null);
      // }
      // } else {
      if (!map.containsKey(curr.hd)) { // first time my hd is occuring
        map.put(curr.hd, curr.node);
      }

      if (curr.node.left != null) {
        q.add(new Info(curr.node.left, curr.hd - 1));
        min = Math.min(min, curr.hd - 1);
      }

      if (curr.node.right != null) {
        q.add(new Info(curr.node.right, curr.hd + 1));
        max = Math.max(max, curr.hd + 1);
      }
    }
    // }

    for (int i = min; i <= max; i++) {
      System.out.print(map.get(i).data + " ");
    }
    System.out.println();
  }

  public static void KLevel(Node root, int level, int k) {
    if (root == null) {
      return;
    }

    if (level == k) {
      System.out.print(root.data + " ");
      return;
    }

    KLevel(root.left, level + 1, k);
    KLevel(root.right, level + 1, k);
  }

  public static void main(String[] args) {

    // 1
    // / \
    // 2 3
    // / \ / \
    // 4 5 6 7

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    // System.out.println(height(root));
    // System.out.println(count(root));
    // System.out.println(sum(root));
    // System.out.println(diameter1(root));
    // System.out.println(diameter2(root).d);

    // topView(root);

    int k = 2;
    KLevel(root, 1, k);
  }
}

// Diameter - no. of nodes in the longest path between 2 leaves.
