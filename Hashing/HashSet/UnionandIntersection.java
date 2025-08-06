import java.util.*;

public class UnionandIntersection {

  public static void main(String[] args) {
    int arr1[] = { 7, 3, 9 };
    int arr2[] = { 6, 3, 9, 2, 9, 4 };

    HashSet<Integer> set = new HashSet<>();

    // union
    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }

    for (int i = 0; i < arr2.length; i++) {
      set.add(arr2[i]);
    }

    System.out.println("union = " + set.size());

    // intersection
    set.clear();

    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }

    int count = 0;
    for (int i = 0; i < arr2.length; i++) {
      if (set.contains(arr2[i])) {
        count++;
        set.remove(arr2[i]);
      }
    }

    System.out.println("intersection = " + count);
  }

}

// arr1 = {7,3,9}
// arr2 = {6,3,9,2,9,4}

// union = 6(7,3,9,6,2,4)
// intersection = 2(3,9)

// set1 U set2 -> unique ele
// set1 intersection -> common ele

// union -> O(n+m)
// arr1 -> set
// arr2 -> set -> set.size() union

// intersection -> O(n+m)
// 1. add all elements of arr1
// 2. for(int i=0 to arr2.length)
// check if exists in set -> count++, remove(ele)