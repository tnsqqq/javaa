import java.util.*;

public class Treemap {

  public static void main(String[] args) {
    TreeMap<String, Integer> tm = new TreeMap<>();
    tm.put("India", 100);
    tm.put("Pakistan", 100);
    tm.put("China", 100);

    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("Pakistan", 100);
    hm.put("China", 100);

    System.out.println(tm);
    System.out.println(hm);

  }

}

// keys are sorted
// put,get,remove are O(logn)
// Treemap<K,V> hm = new Treemap();
// based on key sorted
