import java.util.*;

public class MaxLengthChainOfPairs { // O(nlogn)

  public static void main(String[] args) {
    int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

    Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

    int chainLen = 1;
    int chainEnd = pairs[0][1]; // Last selected pair end. // chain end

    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > chainEnd) {
        chainLen++;
        chainEnd = pairs[i][1];
      }
    }

    System.out.println("max length of chain = " + chainLen);
  }

}

// a--b, c--d
// a < b < d
// longest pair
// same as activity selection

// Approach
// 1. sort pairs (based on 2nd number)
// 2. 1st pair
// for(int i=1; i<n; i++){
// if(pair -> start > lastSelected -> end){
// ans++;
// LS -> end update
// }
// }