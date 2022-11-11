import java.util.*;

public class Solution {

    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {
        int sum1 = 0;
        for( int i=0 ; i<arr1.length ; i++)
        {
            sum1 = sum1 + arr1[i];
        }
        int sum2 = 0;
        for( int j=0 ; j<arr2.length ; j++)
        {
            sum2 = sum2 + arr2[j];
        }

        return sum1 + sum2 ;


    }

    public static void main(String args[]) {
        assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }) == 21) : "Expect 21 for {1,2,3},{4,5,6}";
        System.out.println("All test cases in main function passed");

    }
}

