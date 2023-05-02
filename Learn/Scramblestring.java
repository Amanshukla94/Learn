  import java.io.*;

import java.util.*;

public class Scramblestring {

  public static boolean IsScramble2(String s1, String s2, int si1, int ei1, int si2, int ei2) {
    if (s1.substring(si1, ei1 + 1).equals(s2.substring(si2, ei2 + 1))) { //1
      return true;
    }

    for (int i = 0; i < ei1 - si1; i++) { //2
      if ((IsScramble2(s1, s2, si1, si1 + i, si2, si2 + i) && IsScramble2(s1, s2, si1 + i + 1, ei1, si2 + i + 1, ei2)) 
    		  || (IsScramble2(s1, s2, si1, si1 + i, ei2 - i, ei2) && IsScramble2(s1, s2, si1 + i + 1, ei1, si2, ei2 - i - 1))) { //3
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s1 = "great";
    String s2 = "ergat";
    if (s1.length() != s2.length()) {
      System.out.println("false");
      return;
    }
    System.out.println(IsScramble2(s1, s2, 0, s1.length() - 1, 0, s2.length() - 1));
  }
}