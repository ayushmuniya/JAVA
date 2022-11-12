/* 
Problem Description
Your extended family is getting together for potluck supper! A potluck supper is a meal where each attending member brings a food item to share and eat. 
To ensure variety in the supper dishes, you have placed a rule according to which each person can only bring a dish whose starting and ending letters are the same as the starting and ending letters of the person's name. 
For example, John can only bring dishes with names starting with 'j' and ending in 'n', like "jerk chicken".

Write a function that takes two parameters, "name" and "dish", and determines if the person with the given name is allowed to bring the given dish to the supper. 
Return true if the combination is valid and false otherwise.

It is guaranteed that "name" and "dish" are always lowercase strings and that each has at least two letters. 
"name" and "dish" may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.
*/

import java.util.*;

public class Solution {

    static boolean potluckSupper(String name, String dish) 
    {
        // String str = name;
        // String str1 =  dish;

        char ch = name.charAt(0);
        char ch1 = name.charAt(name.length()-1);

        char ch2 = dish.charAt(0);
        char ch3 = dish.charAt(dish.length()-1);
        

        if (ch == ch2 && ch1 == ch3 )
        {
            return true;
        }
        else
        return false;


    }

    public static void main(String args[]) {
        String name = "jake";
        String dish = "jaffa cake";
        assert (potluckSupper(name, dish) == true) : "Expect true for name = \"jake\" and dish = \"jaffa cake\"";
        dish = "butterscotch mousse";
        assert (potluckSupper(name, dish) == false) : "Expect false for name = \"jake\" and dish = \"butterscotch mousse\"";
        System.out.println("All test cases in main function passed");

    }
}

