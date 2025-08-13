public class GridWays { // O(2^n+m) exponential

  public static int gridWays(int i, int j, int n, int m) {
    // base case
    if (i == n - 1 && j == m - 1) { // Condition for last cell
      return 1;
    } else if (i == n || j == n) { // boundary cross condition
      return 0;
    }

    int w1 = gridWays(i + 1, j, n, m);
    int w2 = gridWays(i, j + 1, n, m);
    return w1 + w2;
  }

  public static void main(String[] args) {
    int n = 3, m = 3;
    System.out.println(gridWays(0, 0, n, m));
  }
}

// Math Trick for Linear Time
// Permutation -> (n-1 + m-1)!/(n-1)!(m-1)! = total ways
// O(n+m)
