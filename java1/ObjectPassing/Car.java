public class Car
{
	String name; // when we define the constructor we have to define a variable of same type(as passed in constructor) to access the value of variable passed using dot operator
	
	String color; //chedchad
	
	
	Car(String naam) // constructor of the class 'Car'
	{
		this.name = naam;

	}
	
	Car(String naam, String rang) //chedchad
	{
		this.name = naam;
		this.color = rang;
	}
}

