import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution 
{

    public static List<Integer> updateMarks(List<Integer> list, int rollNo, int marks) 
    {
        list.set(rollNo, marks);
        return list;
    }

    public static void main(String args[]) 
    {
        List<Integer> list = Arrays.asList(12, 35, 67, 89, 9);
        assert list.equals(updateMarks(list, 4, 98)) : "Expect [12, 35, 67, 89, 98] after updating rollNo = 4";
        System.out.println("All test cases in main function passed");
    }
}

