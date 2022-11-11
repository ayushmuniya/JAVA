import java.util.*;

public class Solution {

    static int totalStudents(int[][] matrix) 
    {
        int sum =0;
        for(int i=0; i<matrix.length; i++) 
        {
            for(int j=0; j<matrix[i].length; j++) 
            {
                sum = sum + matrix[i][j];
            }
        }return sum;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 0 }, { 0, 1 } };
        assert (totalStudents(arr) == 2) : "Expect 2 for arr[][] = { { 1, 0 }, { 0, 1 } }";
        System.out.println("All test cases in main function passed");

    }
}

