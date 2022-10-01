
public class Hero extends Person
{
	String power;
	
	Hero(String name, int age, String power)
	// we defined the constructor which takes name,age,power as arguments, but name and age are the attributes of super/parent class
	//therefore we sent them to parent class using super keyword
	{
		/*
		this.name = name; //since the name attribute is defined in the super/parent class 'Person' we should assign them values in the constructor of 'Person' class itself
		this.age = age; //since the age attribute is defined in the super/parent class 'Person' we should assign them values in the constructor of 'Person' class itself
		this.power = power;// since we power attribute is defined in 'Hero' class, we should assign its value in the constructor of 'Hero' class
		
		//the above written way is not wrong though, but its not the best way to do this */
		
		//the best way to write above is shown below:
		
		super(name,age); //passing the name and age attributes to the super/parent class's constructor
		this.power = power;
		
	}
	
	//way 2
	public String toString() 
	{
		return super.toString()+this.power; // this will call the toString() method of our super class + we will also add power that we have from this class.
	}
}
