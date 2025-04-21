import java.util.ArrayList;

class Operators {
  public static void main(String[] args) {
    // ClassName objectName = new ClassName();
    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();
    // ArrayList<Boolean> list3 = new ArrayList<>();

    // add element
    list.add(1); // O(1)
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1, 9);

    System.out.println(list);

    // get element // O(1)
    int element = list.get(1);
    System.out.println(element);

    // remove element // O(n)
    list.remove(3);
    System.out.println(list);

    // set element // O(n)
    list.set(2, 77);
    System.out.println(list);

    // contains element // O(n)
    System.out.println(list.contains(3));

  }
}