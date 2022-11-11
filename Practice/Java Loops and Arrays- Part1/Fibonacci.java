import java.util.*;

public class Solution {

    static int getNthFibonacciNumber(int n) 
    {
       if(n <= 1)
            return n;
        
		int num1 = 0, num2 = 1;
		
		while(n-- > 1)
		{
			int nextNumber = num1 + num2;
			num1 = num2;
			num2 = nextNumber;
		}
        return num2;
    }

    public static void main(String args[]) {

        assert (getNthFibonacciNumber(3) == 2) : "Expect \"2\" for N = 3";
        assert (getNthFibonacciNumber(4) == 3) : "Expect \"3\" for N = 4";
        System.out.println("All test cases in main function passed");


    }
}

