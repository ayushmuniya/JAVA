import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution 
{
    List<String> list = new ArrayList<String>();

    public Solution(List<String> list) 
    {
      this.list = list;
    }
    public int celebrityIndex(String celeb) 
    {
      boolean ans = list.contains(celeb);

      if (ans == true)
      {
        int pos = list.indexOf(celeb);
        return pos + 1;
      }
      else
      return -1;
    }

    public static void main(String args[]) {
      List<String> list = Arrays.asList("Kendall Jenner", "Cardi B", "Blake Lively", "Gigi Hadid",
          "Simone Ashley", "Rihanna Fenty");
        Solution obj = new Solution(list);
        String celeb1 = "Blake Lively";
        assert obj.celebrityIndex(celeb1) == 3 : "Expect 3 for celeb = Blake Lively";
        String celeb2 = "Taylor Swift";
        assert obj.celebrityIndex(celeb2) == -1 : "Expect -1 for celeb = Taylor Swift";
        System.out.println("All test cases in main function passed");
    }
}

