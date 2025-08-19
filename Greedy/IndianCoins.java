import java.util.*;

public class IndianCoins {

  public static void main(String[] args) {
    Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

    Arrays.sort(coins, Comparator.reverseOrder());

    int count = 0;
    int amount = 240;
    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < coins.length; i++) {
      if (coins[i] <= amount) {
        while (coins[i] <= amount) {
          count++;
          ans.add(coins[i]);
          amount -= coins[i];
        }
      }
    }

    System.out.println("total (min) coins used = " + count);

    for (int i = 0; i < ans.size(); i++) {
      System.out.println(ans.get(i) + " ");
    }
    System.out.println();
  }

}

// We are given an infinite supply of denominations
// [1,2,5,10,20,50,100,500,1000].
// Find min no. of coins/notes to make change for a value V.

// V = 121
// ans = 3(100+20+1)

// V = 590
// ans = 4(500+50+20+20)

// Approach-
// 1. sort descending [2000, 500, 100, 50, 20, 10, 5, 2, 1]
// amount = 590;
// int count = 0;
// for(int i=0; i<n; i++){
// if(coin[i] < amount){
// while(coin[i] < amount){
// count++;
// amount = amount - coin[i];
// }}}
