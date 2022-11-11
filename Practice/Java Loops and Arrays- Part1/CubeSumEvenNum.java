import java.util.*;

public class Solution {
  

    public static int cubeSum(int[] arr) 
    {
      int sum = 0;
      for (int i=0; i<arr.length ; i++)
      {
        if (arr[i]%2 == 0)
        {
          sum = sum + (arr[i]*arr[i]*arr[i]);
        }
      }
      return sum;
    }

    public static void main(String args[]) {

      assert cubeSum(new int[] { 1, 2, 3, 4 }) == 72 : "Expect 72 for {1,2,3,4}";
      System.out.println("All test cases in main function passed");

    }
}

