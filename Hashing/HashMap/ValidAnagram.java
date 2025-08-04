import java.util.*;

public class ValidAnagram { // O(n), where n is no of characters in string, worst case -> n^2


  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      if (map.get(ch) != null) {
        if (map.get(ch) == 1) {
          map.remove(ch);
        } else {
          map.put(ch, map.get(ch) - 1);
        }
      } else {
        return false;
      }
    }

    return map.isEmpty();
  }

  public static void main(String[] args) {
    String s = "aaa";
    String t = "care";

    System.out.println(isAnagram(s, t));

  }

}

// Given two strings s and t, return true if t is an anagram of s, and false
// otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a
// different word or phase,
// typically using all the original letters exactly once.

// s = "race", t = "care" -> TRUE
// s = "heart", t = "earth" -> TRUE
// s = "tulip", t = "lipid" -> FALSE

// no. of letters and value of letter is same
// ab -> ba

// Approach
// s = "knee", t = "keen"

// HashMap<Character, Frequency> / <char, Integer>

// map.isEmpty() -> true -> true
// -> false -> false

// for(int i=0 to t.length())
// ch = t.charAt(i)
// if(map.get(ch))
// freq
// else
// return false

// 1. add(char, freq) of "s" in map
// 2. loop on "t"
// 3. map.isEmpty -> true, else false