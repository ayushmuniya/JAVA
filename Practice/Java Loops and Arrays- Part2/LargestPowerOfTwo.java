import java.util.*;

public class Solution {

    static int findLargestPowerOfTwo(int n) 
   {
         if (n==0)
         {
             return n;
         }
         else
         return (int)(Math.log(n) / Math.log(2));
    }

    public static void main(String args[]) {

        assert findLargestPowerOfTwo(9) == 3 : "Expect 3 for n = 9";

        assert findLargestPowerOfTwo(32) == 5 : "Expect 5 for n = 32";
        System.out.println("All test cases in main function passed");

    }
}

