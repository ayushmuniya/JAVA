package toString;

public class Car
{
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;
	
	//  overriding toString method to do something else for us
	
	public String toString() 
	{
		String specs = make + "\n" + model + "\n" + color + "\n" + year;
		return specs;
		
		//now when we call toStirng method in Main, we will get output = Ford Mustang red 2021
		
	}
	
	
}
