import java.util.*;

public class reverse {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    // Collections.reverse(list);

    // Manually reverse the list
    // int left = 0;
    // int right = list.size() - 1;

    // while (left < right) {
    // // Swap elements
    // int temp = list.get(left);
    // list.set(left, list.get(right));
    // list.set(right, temp);

    // left++;
    // right--;
    // }

    // Reverse print - O(n)
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    // System.out.println(list);
  }
}
