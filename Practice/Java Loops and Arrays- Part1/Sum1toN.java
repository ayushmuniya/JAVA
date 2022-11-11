import java.util.*;
// import static org.junit.Assert.assertEquals;


public class Solution {

    public static int addNums(int n) {
        int sum = 0;
        for (int i=0 ; i<=n; i++){
            sum = sum + i;
           
        }
         return sum;
    }

    public static void main(String args[]) {
        int n = 3;
        assert addNums(n) == 6 : "Expect 6 for n = 3";
        System.out.println("All test cases in main function passed");
    }
}

