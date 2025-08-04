// no duplicates -> unique
// unordered
// NULL is allowed

// HashSet<Integer> hs = new HashSet<>();

// add(key) -> O(1)
// contains(key)
// remove(key)

// internally works as hashmap

// Iteration on HashSet
// a. using Iterators
// Iterator it = set.iterator()
// while(it.hasNext()){
// print(it.next())
// }

// b. using Enhanced for loop
// for (String city : cities) {
// System.out.println(city);
// }

import java.util.*;

public class Hashset {
  public static void main(String[] args) {
    // HashSet<Integer> set = new HashSet<>();

    // set.add(1);
    // set.add(2);
    // set.add(4);
    // set.add(2);
    // set.add(1);

    // System.out.println(set);
    // set.clear();
    // System.out.println(set.size());
    // System.out.println(set.isEmpty());

    // set.remove(2);

    // if (set.contains(2)) {
    // System.out.println("set contains 2");
    // } else {
    // System.out.println("set do no contains 2");
    // }

    // if (set.contains(3)) {
    // System.out.println("set contains 3");
    // }

    HashSet<String> cities = new HashSet<>();

    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");

    // Iterator it = cities.iterator();
    // while (it.hasNext()) {
    // System.out.println(it.next());
    // }

    for (String city : cities) {
      System.out.println(city);
    }

  }
}