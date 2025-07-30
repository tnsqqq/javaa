import java.util.*;

public class LinkedHashmap {
  public static void main(String[] args) {
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("India", 100);
    lhm.put("Pakistan", 100);
    lhm.put("China", 100);

    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("Pakistan", 100);
    hm.put("China", 100);

    System.out.println(lhm);
    System.out.println(hm);

  }
}

// keys are insertion ordered

// LinkedHashMap<K, V> hm = new LinkedHashmap();
