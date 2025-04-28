import java.util.ArrayList;

public class MostFreqNum {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(100);
    list.add(200);
    list.add(1);
    list.add(100);

    int ans = mostFreq(list, 1);
    System.out.println(ans);
  }

  public static int mostFreq(ArrayList<Integer> list, int key) {
    int[] res = new int[1000];

    for (int i = 0; i <= list.size() - 2; i++) {
      if (list.get(i) == key) {
        res[list.get(i + 1) - 1]++;
      }
    }

    int max = Integer.MIN_VALUE;
    int ans = 0;

    for (int i = 0; i < 1000; i++) {
      if (res[i] > max) {
        max = res[i];
        ans = i + 1;
      }
    }
    return ans;

  }
}
