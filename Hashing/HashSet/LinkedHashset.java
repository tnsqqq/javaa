// Ordered using DLL(Doubly Linked List)
// Performance
// LHM < HM
// LHS < HS
// More operations in Linked for maintaining ordered
// time complexity same but performance lack a bit
// O(1)

import java.util.*;

public class LinkedHashset {
  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();

    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");

    System.out.println(cities);

    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Delhi");
    lhs.add("Mumbai");
    lhs.add("Noida");
    lhs.add("Bengaluru");

    // System.out.println(lhs);

    lhs.remove("Delhi");
    System.out.println(lhs);
  }
}
