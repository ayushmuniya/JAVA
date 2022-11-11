import java.util.*;

public class Solution {

  public static String checkLeapYear(int year) {
    if ((year%4 == 0) || (year%4 == 0 && year%100 !=0)){
      return "LEAP YEAR";
    }
    else
    return "COMMON YEAR";
  }

  public static void main(String args[]) {
        assert (checkLeapYear(2020).equals("LEAP YEAR")) : "Expect LEAP YEAR for year = 2020";
        System.out.println("All test cases in main function passed");
    }
}


