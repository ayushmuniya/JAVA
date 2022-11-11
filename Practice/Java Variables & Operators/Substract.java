import java.util.*;

public class Solution {

    public static int subtractTwoNumbers(int a, int b) {
        if(a>=0 || a<0){
            return a-b;
        }
        // else if(a<0){
        // return a-b;
        // }
        else
        return b-a;

    }

    public static void main(String args[]) {
        assert (subtractTwoNumbers(766, 100) == 666) : "Expect 666 for a = 766, b = 100";
        System.out.println("All test cases in main function passed");

    }
}
