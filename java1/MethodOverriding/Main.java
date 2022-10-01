
public class Main
{

	public static void main(String[] args)
	{
		
		Dog dog = new Dog();
		dog.speak(); //when we call the speak method, the overridden method will be called as now 'Dog' class has its own speak() method
		//output = the dog goes bark
		
		Animal animal = new Animal();
		animal.speak(); //this will call the method in the 'Animal' class
		//output = the animal speaks

	}

}
