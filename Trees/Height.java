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

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }

    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }

  public static int count(Node root) {
    if (root == null) {
      return 0;
    }

    int lc = count(root.left);
    int rc = count(root.right);
    return lc + rc + 1;
  }

  public static int sum(Node root) {
    if (root == null) {
      return 0;
    }

    int ls = sum(root.left);
    int rs = sum(root.right);
    return ls + rs + root.data;
  }

  public static int diameter1(Node root) { // O(n^2) -> height is calculated seperately
    if (root == null) {
      return 0;
    }

    int ldia = diameter1(root.left);
    int rdia = diameter1(root.right);

    int lh = height(root.left);
    int rh = height(root.right);

    int selfdia = lh + rh + 1;

    return Math.max(selfdia, Math.max(ldia, rdia));
  }

  static class Info {
    int d;
    int ht;

    public Info(int d, int ht) {
      this.d = d;
      this.ht = ht;
    }
  }

  public static Info diameter2(Node root) { // O(n)
    if (root == null) {
      return new Info(0, 0);
    }

    Info lInfo = diameter2(root.left);
    Info rInfo = diameter2(root.right);

    int d = Math.max(Math.max(lInfo.d, rInfo.d), lInfo.ht + rInfo.ht + 1);
    int ht = Math.max(lInfo.ht, rInfo.ht) + 1;
    return new Info(d, ht);
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

    System.out.println(height(root));
    System.out.println(count(root));
    System.out.println(sum(root));
    System.out.println(diameter1(root));
    System.out.println(diameter2(root).d);
  }
}

// Diameter - no. of nodes in the longest path between 2 leaves.
