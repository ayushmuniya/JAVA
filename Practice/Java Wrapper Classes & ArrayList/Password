import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution 
{

    public static ArrayList<String> changePassword(ArrayList<String> list) 
    {
      // ArrayList<String> result = new ArrayList<String>();
      int size = (list.size() -1);
      String element = list.get(0);

      list.remove(0);

      list.add(size, element);
      return list;
      
    }

    public static void main(String args[]) 
    {
      ArrayList<String> inputList = new ArrayList<String> (Arrays.asList("Dilligrout", "Baubles", "Caput Draconis", "Pig Snout",
          "Wattlebird", "Banana Fritters"));

      ArrayList<String> changedOnce = new ArrayList<String> (Arrays.asList("Baubles",
          "Caput Draconis", "Pig Snout", "Wattlebird", "Banana Fritters", "Dilligrout"));
      ArrayList<String> changedTwice = new ArrayList<String> (Arrays.asList("Caput Draconis",
          "Pig Snout", "Wattlebird", "Banana Fritters", "Dilligrout", "Baubles"));


        assert changedOnce.equals(changePassword(inputList)) : "Expect [\"Baubles\", \"Caput Draconis\", \"Pig Snout\", \"Wattlebird\", \"Banana Fritters\", \"Dilligrout\"]";
        assert changedTwice.equals(changePassword(inputList)) : "Expect [\"Caput Draconis\", \"Pig Snout\", \"Wattlebird\", \"Banana Fritters\", \"Dilligrout\", \"Baubles\"]";

      System.out.println("All test cases in main function passed");
    }
}

