import java.util.*;

public class Solution 
{

    public static String  indexCapitalisation(String s, int[] ind)
    {

        char[] result = s.toCharArray();
        
        for(int i : ind) 
        {
            if(i < result.length)
            {
                result[i] = Character.toUpperCase(result[i]);
            }
            else continue;
        }
        String str = String.valueOf(result);
        return str;
     
      
      
    }
    

    public static void main(String args[]) 
    {
        String s = "learn by doing";
        int[] ind = new int[] { 0, 6, 9 };
        assert (indexCapitalisation(s, ind).equals("Learn By Doing")) : "Expect \"Learn By Doing\" for s = \"learn by doing\" and ind = [0, 6, 9]";

        System.out.println("All test cases in main function passed");

    }
}

