import java.util.*;

public class LonelyNumber {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(6);
    list.add(5);
    list.add(8);

    System.out.println(lonely(list));
  }

  public static ArrayList<Integer> lonely(ArrayList<Integer> list) {

    Collections.sort(list);

    ArrayList<Integer> li = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      int num = list.get(i);

      if (Collections.frequency(list, num) == 1 && !list.contains(num + 1) && !list.contains(num - 1))
        li.add(num);
    }

    return li;
  }

}
