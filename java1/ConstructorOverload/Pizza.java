
public class Pizza
{
	String bread; // global variables
	String sauce; // global variables
	String cheese; // global variables
	String topping;// global variables

	Pizza(String toast, String chutney, String cheesy, String uprikana) //Pizza constructor with 4 arguments
	{
		this.bread = toast; //using this keyword to assign the arguments received in the constructor to our defined variables so that we can access this arguments via variable defined.
		this.sauce = chutney;
		this.cheese = cheesy;
		this.topping = uprikana;
	}
	Pizza(String bread,String sauce) // Pizza constructor with 2 arguments
	{
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread,String sauce,String cheese) //Pizza constructor with 3 arguments
	{
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
}
 
