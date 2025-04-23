import java.util.ArrayList;

// brute force

// public class PairSum {

//   public static boolean pairSum(ArrayList<Integer> list, int target) {

//     for (int i = 0; i < list.size(); i++) {
//       for (int j = i + 1; j < list.size(); j++) {
//         if (list.get(i) + list.get(j) == target) {
//           return true;
//         }
//       }
//     }
//     return false;
//   }

//   public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();

//     // 1 2 3 4 5
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);

//     int target = 55;
//     System.out.println(pairSum(list, target));
//   }

// }

// 2 pointer approach

public class PairSum1 {

  public static boolean pairSum(ArrayList<Integer> list, int target) {

    int start = 0;
    int end = list.size() - 1;

    while (start != end) {

      // case 1
      if (list.get(start) + list.get(end) == target) {
        return true;
      }

      // case 2
      if (list.get(start) + list.get(end) < target) {
        start++;
      } else {
        end--;
      }
    }
    return false;

  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // 1 2 3 4 5
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    int target = 5;
    System.out.println(pairSum(list, target));
  }
}
