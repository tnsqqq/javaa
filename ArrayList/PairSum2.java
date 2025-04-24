import java.util.ArrayList;

public class PairSum2 {

  public static boolean pairSum(ArrayList<Integer> list, int target) {
    int bp = -1;
    int n = list.size();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) > list.get(i + 1)) { // breaking point
        bp = i;
        break;
      }
    }

    int s = bp + 1; // smallest
    int e = bp; // largest

    while (s != e) {

      // case 1
      if (list.get(s) + list.get(e) == target) {
        return true;
      }

      // case 2
      if (list.get(s) + list.get(e) < target) {
        s = (s + 1) % n;
      } else {
        e = (n + e - 1) % n;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // 11 15 6 8 9 10 - sorted & rotated
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);

    int target = 16;
    System.out.println(pairSum(list, target));

  }
}
