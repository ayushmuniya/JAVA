import java.util.*;
public class Main
{
	public static void main(String args[]) 
  {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>(); // creating a 2d_ArryList
		
		ArrayList<String> bakeryList = new ArrayList<String>() ; // ArrayList
		bakeryList.add("donuts");
		bakeryList.add("garlic bread");
		bakeryList.add("pasta");
		
		ArrayList<String> produceList = new ArrayList<String>() ; // ArrayList
		produceList.add("tomota");
		produceList.add("zuccni");
		produceList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList<String>() ; // ArrayList
		drinkList.add("soda");
		drinkList.add("water");
		drinkList.add("brocode");
		
		groceryList.add(bakeryList); //adding all the above lists to groceryList
		groceryList.add(produceList); //adding all the above lists to groceryList
		groceryList.add(drinkList); //adding all the above lists to groceryList
		
		System.out.println(groceryList); //printing groceryList
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));
		System.out.println(groceryList.get(2).get(1));
	}
}
