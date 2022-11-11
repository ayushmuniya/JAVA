import java.util.*;

public class Solution {

    public static int remainderOfDivision(int a, int b) {
        return (a - b * (a / b));
    }

    public static void main(String args[]) {
        assert (remainderOfDivision(10, 3) == 1) : "Expect 1 for a = 10, b = 3";
        System.out.println("All test cases in main function passed");

    }
}
