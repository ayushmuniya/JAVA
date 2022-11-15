import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static boolean isIdentical(Float s1, Float s2) 
    {
        float f1 = s1.floatValue();
        float f2 = s2.floatValue();

        if(f1 == f2)
        {
            return true;
        }
        else
        return false;

    }

    public static void main(String args[]) {
        Float s1 = 2.56789f;
        Float s2 = 2.56789f;
        assert isIdentical(s1, s2) == true : "Expect true for s1 = 2.56789 and s2 = 2.56789";
        s1 = 1.7689f;
        s2 = 3.2456f;
        assert isIdentical(s1, s2) == false : "Expect false for s1 = 1.7689 and s2 = 3.2456";
        System.out.println("All test cases in main function passed");
    }
}

