import java.util.HashMap;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		HashMap<String, String> countries = new HashMap <String, String>();
		
		//add a key and value pair
		
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Mascow");
		countries.put("China", "bejing");
		
		System.out.println(countries);
		
//		countries.remove("USA");
		System.out.println(countries);
		
//		countries.get("Russia");
		System.out.println(countries.get("Russia"));
		
//		countries.clear();
		System.out.println(countries);
		
		countries.size();
		System.out.println(countries.size());
		
		countries.replace("USA", "XYZ");
		System.out.println(countries);
		
		System.out.println(countries.containsKey("England"));
		
		System.out.println(countries.containsValue("New Delhi"));
		
		for(String i : countries.keySet()) {
			System.out.print(i + "\t" + "= ");
			System.out.println(countries.get(i));
		}

	}

}
