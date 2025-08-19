import java.util.*;

public class JobSequence {

  static class job {
    int deadline;
    int profit;
    int id;

    public job(int i, int d, int p) {
      id = i;
      deadline = d;
      profit = p;
    }
  }

  public static void main(String[] args) {
    int jobsInfo[][] = { { 4, 20 }, { 1, 20 }, { 1, 40 }, { 1, 30 } };

    ArrayList<job> jobs = new ArrayList<>();

    for (int i = 0; i < jobsInfo.length; i++) {
      jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
    }

    Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
    // descending order of profit

    ArrayList<Integer> seq = new ArrayList<>();

    int time = 0;
    for (int i = 0; i < jobs.size(); i++) {
      job curr = jobs.get(i);
      if (curr.deadline > time) {
        seq.add(curr.id);
        time++;
      }
    }

    // print seq
    System.out.println("max jobs = " + seq.size());
    for (int i = 0; i < seq.size(); i++) {
      System.out.print(seq.get(i) + " ");
    }
    System.out.println();

  }

}

// Job A = 4, 20
// Job B = 1, 10
// Job C = 1, 40
// Job D = 1, 30

// Profit max.

// Approach-
// 1. Jobs sort (based on profit)
// 2. time = 0
// arraylist ans.
// for(int i=0; i<jobs; i++){
// if(job(deadline) > time){
// add job in ans
// time++;
// }}

// object -> sort
