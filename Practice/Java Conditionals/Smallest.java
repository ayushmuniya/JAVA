import java.util.*;

public class Solution {

  public static int findSmallest(int a, int b, int c) {
    if (a<b && b<c){
      return a;
    }
    else if (b<a && a<c){
      return b;
    }
    else {
      return c;
    }
  }

  public static void main(String args[]) {
        assert (findSmallest(1, 9, 78) == 1) : "Expect 1 for a = 1, b = 9, c = 78";
        System.out.println("All test cases in main function passed");

    }
}
