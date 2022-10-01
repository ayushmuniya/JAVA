
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hero hero1 = new Hero("Batman", 42 ,"$$$");
		Hero hero2 = new Hero("Superman", 60 ,"everything");
		
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		
		System.out.println(hero2.toString()); //way2
	}

}
