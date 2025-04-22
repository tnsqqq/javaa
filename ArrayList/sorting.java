import java.util.ArrayList;
import java.util.Collections;

public class sorting {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(3);
    list.add(2);
    list.add(99);
    list.add(6);

    Collections.sort(list); // ascending order
    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder()); // descending order, Comparators - fnx logic
    System.out.println(list);
  }
}
