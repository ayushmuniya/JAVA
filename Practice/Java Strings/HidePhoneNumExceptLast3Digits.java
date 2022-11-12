import java.util.*;

public class Solution {

    static String hidePhoneNumber(String s) 
    {
        StringBuilder lastFour = new StringBuilder();

        int check = 0;
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            if (Character.isDigit(s.charAt(i))) 
            {
                check++;
            }
            if (check <= 3) 
            {
                lastFour.append(s.charAt(i));
            } else 
            {
                lastFour.append(Character.isDigit(s.charAt(i)) ? "*" : s.charAt(i));
            }
        }
        return lastFour.reverse().toString();

        //alterantive
        // return s.replaceAll("\\d(?=\\d{3})", "*");
    }


    public static void main(String args[]) {
        assert (hidePhoneNumber("9090213229").equals("*******229")) : "Expect \"*******229\" when s= \"9090213229\"";
        System.out.println("All test cases in main function passed");

    }
}

