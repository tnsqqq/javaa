// Hashing
// -> map -> Hashmap
// -> LinkedHashMap
// -> Treemap
// -> set -> HashSet
// -> LinkedHashSet
// -> TreeSet

import java.util.*;

public class Hashing {

  public static void main(String[] args) {
    // create
    HashMap<String, Integer> hm = new HashMap<>();

    // Insert - O(1)
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 200);

    System.out.println(hm);

    // Get - O(1)
    // int population = hm.get("India");
    // System.out.println(population);

    // System.out.println(hm.get("Indonesia"));

    // // ContainsKey - O(1)
    // System.out.println(hm.containsKey("India"));
    // System.out.println(hm.containsKey("Pakistan"));

    // Remove
    // System.out.println(hm.remove("China"));
    // System.out.println(hm);

    // Size
    System.out.println(hm.size());

    // IsEmpty
    hm.clear();
    System.out.println(hm.isEmpty());

  }
}

// HashMap
// (key, value)
// key -> unique

// HashMap<String, Integer> hm = new HashMap<>();

// no duplicate key

// HashMap Operations

// put(key, value)
// get(key)
// contains(key)
// remove(key)

// hashmap -> unordered