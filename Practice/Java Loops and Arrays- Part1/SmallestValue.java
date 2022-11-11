import java.util.*;

public class Solution {

    static int smallestValueOfArray(int[] numbers, String toReturn) 
    {

        int min = numbers[0];
        int index_val = 0;
        

            for(int i=0; i<numbers.length ; i++)
            {
                if(min > numbers[i])
                {
                    min = numbers[i];
                    index_val = i;
                }
            }
            if (toReturn.equals("value")) 
            {
            return min;
            } 

            else if (toReturn.equals("index")) 
            {
            return index_val;
            } 

            else 
            {
            return min; // default returns value
            }

            
    }

    public static void main(String args[]) {
        assert (1 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "value")) : "Expect 1 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        assert (3 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "index")) : "Expect 3 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        System.out.println("All test cases in main function passed");

    }
}

