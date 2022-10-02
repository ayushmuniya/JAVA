import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Animal animal;
		//here we are just creating the room/space for our object but we are not yet sure weather this object will be Dog or Cat, which we decide after runtime
		//once this object does assume a form during runtime, then its going to inherit everything from the parent class 
		///here we are deciding which class object's method is to be called after runtime, like after taking the user input
		
		System.out.println("What animal do you want?"); 
		System.out.print("(1=dog) or (2=cat): ");
		int choice = scanner.nextInt();
		
		if(choice == 1 ) {
			animal = new Dog(); // we are using our animal object here and constructing animal as a Dog 
			animal.speak(); // this will all the speak method of Dog
		}
		
		else if(choice == 2 ) {
			animal = new Cat(); // we are using our animal object here and constructing animal as a Cat
			animal.speak(); // this will all the speak method of Cat
		}
		else {
			animal = new Animal();
			System.out.println("invaild input");
			animal.speak();
		}
		
	}

}
