
public class Main
{
	public static void main(String[] args)
	{
		Pizza pizza = new Pizza("thin crust", "tomato", "mozzeralla" , "pepperoni"); //instantiating an object of Pizza class
		
		System.out.println("here are the ingredients of your pizza");
		
		System.out.println(pizza.bread); // accessing the bread variable of our pizza object
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		
	}
}
