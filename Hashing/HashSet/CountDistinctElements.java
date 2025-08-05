import java.util.*;

public class CountDistinctElements {
  public static void main(String[] args) {
    int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < num.length; i++) { // O(n)
      set.add(num[i]);
    }

    System.out.println("ans = " + set.size());
  }

}

// num = {4,3,2,5,6,7,3,4,2,1}
// ans = 7
// Bruteforce (nested loop) -> 4,3,2,5,6,7,1 -> size
// for(int i=0 to nums.length)
// for(int j=0 to res.length) -> O(n^2)
// set -> set.size() -> O(n)
