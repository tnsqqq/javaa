import java.util.PriorityQueue;

public class ConnectNRopes {

  public static void main(String[] args) {
    int ropes[] = { 2, 3, 3, 4, 6 };

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < ropes.length; i++) {
      pq.add(ropes[i]);
    }

    int cost = 0;
    while (pq.size() > 1) {
      int min1 = pq.remove();
      int min2 = pq.remove();
      cost += min1 + min2;
      pq.add(min1 + min2);
    }

    System.out.println("Cost of coonecting n ropes = " + cost);
  }

}

// min length -> ropes add
// take 2 min
// ropes = {2,3,3,4,6}
// 2+3 = 5
// 3+4 = 7
// 5+6 = 11 + 12 = 23
// 7+11 = 18 + 23 = 41

// greedy -> sort and add 1 by 1
// 2+3 = 5
// 5+3 = 8
// 8+4 = 12 + 13 = 25
// 12 + 6 = 18 + 25 = 43
