import java.util.ArrayList;

// public class ContainerWithMostWater {
// public static void main(String[] args) {
// ArrayList<Integer> height = new ArrayList<>();

// // 1 8 6 2 5 4 8 3 7
// height.add(1);
// height.add(8);
// height.add(6);
// height.add(2);
// height.add(5);
// height.add(4);
// height.add(8);
// height.add(3);
// height.add(7);

// System.out.println(storeWater(height));
// }

// public static int storeWater(ArrayList<Integer> height) {
// int maxWater = 0;

// // bruteforce
// for (int i = 0; i < height.size(); i++) {
// for (int j = i + 1; j < height.size(); j++) {
// int ht = Math.min(height.get(i), height.get(j));
// int width = j - i;
// int currWater = ht * width;
// maxWater = Math.max(maxWater, currWater);
// }
// }
// return maxWater;
// }
// }

// 2 Pointer Approach

public class ContainerWithMostWater {
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();

    // 1 8 6 2 5 4 8 3 7
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(storeWater(height));
  }

  public static int storeWater(ArrayList<Integer> height) {
    int lh = 0;
    int rh = height.size() - 1;
    int maxWater = 0;

    while (lh < rh) {
      // calculate water area
      int ht = Math.min(height.get(lh), height.get(rh));
      int width = rh - lh;
      int currWater = ht * width;
      maxWater = Math.max(maxWater, currWater);

      // update ptr
      if (height.get(lh) < height.get(rh)) {
        lh++;
      } else {
        rh--;
      }
    }
    return maxWater;
  }
}

// O(n)