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

  // class Solution {
  // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
  // if (root == null) return false;
  // if (isSameTree(root, subRoot)) return true;
  // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  // }

  // private boolean isSameTree(TreeNode s, TreeNode t) {
  // if (s == null && t == null) return true;
  // if (s == null || t == null) return false;
  // if (s.val != t.val) return false;

  // return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
  // }
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

  public static boolean getPath(Node root, int n, ArrayList<Node> path) {
    if (root == null) {
      return false;
    }

    path.add(root);

    if (root.data == n) {
      return true;
    }

    boolean foundLeft = getPath(root.left, n, path);
    boolean foundRight = getPath(root.right, n, path);

    if (foundLeft || foundRight) {
      return true;
    }

    path.remove(path.size() - 1);
    return false;

  }

  public static Node lca(Node root, int n1, int n2) { // O(n)
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();

    getPath(root, n1, path1);
    getPath(root, n2, path2);

    // last common ancestor
    int i = 0;
    for (; i < path1.size() && i < path2.size(); i++) {
      if (path1.get(i) != path2.get(i)) {
        break;
      }
    }

    // last equal node -> i-1th
    Node lca = path1.get(i - 1);
    return lca;
  }

  public static Node lca2(Node root, int n1, int n2) { // O(n)
    if (root == null || root.data == n1 || root.data == n2) {
      return root;
    }

    Node leftLca = lca2(root.left, n1, n2);
    Node rightLca = lca2(root.right, n1, n2);

    // leftLca = val , rightLca = null
    if (rightLca == null) {
      return leftLca;
    }
    if (leftLca == null) {
      return rightLca;
    }

    return root;
  }

  public static int lcaDist(Node root, int n) {
    if (root == null) {
      return -1;
    }

    if (root.data == n) {
      return 0;
    }

    int leftDist = lcaDist(root.left, n);
    int rightDist = lcaDist(root.right, n);

    if (leftDist == -1 && rightDist == -1) {
      return -1;
    } else if (leftDist == -1) {
      return rightDist + 1;
    } else {
      return leftDist + 1;
    }
  }

  public static int minDist(Node root, int n1, int n2) {
    Node lca = lca2(root, n1, n2);
    int dist1 = lcaDist(lca, n1);
    int dist2 = lcaDist(lca, n2);

    return dist1 + dist2;

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

    // Node subRoot = new Node(2);
    // subRoot.left = new Node(4);
    // subRoot.right = new Node(5);

    // System.out.println(height(root));
    // System.out.println(count(root));
    // System.out.println(sum(root));
    // System.out.println(diameter1(root));
    // System.out.println(diameter2(root).d);

    // topView(root);

    // int k = 2;
    // KLevel(root, 1, k);

    int n1 = 4, n2 = 6;
    // System.out.println(lca(root, n1, n2).data);
    // System.out.println(lca2(root, n1, n2).data);

    System.out.println(minDist(root, n1, n2));

  }
}

// Diameter - no. of nodes in the longest path between 2 leaves.
