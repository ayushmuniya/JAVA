import java.util.*;

public class Solution
{

    static String switcheroo(String s) 
    {
        char[] arr = s.toCharArray();

        for (int i=0; i<s.length();i++)
        {
            if(arr[i]=='a')
            {
              arr[i]='b';
            }
            else if(arr[i]=='b')
            {
              arr[i]='a';
            }
        }
        String result = String.valueOf(arr);
        return result;
    }
    
        //alternate
        // String result = s.replace('a', '_').replace('b', 'a').replace('_', 'b');

        // return result;

    public static void main(String args[]) {
        String s = "aabacbaa";
        assert (switcheroo(s).equals("bbabcabb")) : "Expect \"bbabcabb\" for s = \"aabacbaa\"";
        System.out.println("All test cases in main function passed");

    }
}

