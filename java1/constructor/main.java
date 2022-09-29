
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Human human1 = new Human("rick", 65, 75); // calling constructor or in other terms calling method
		Human human2 = new Human("monty", 60, 70);

		System.out.println(human1.name);// here we are accessing the 'name' attribute/variable of human class for its obj human1
		//thats how we used to do when we wanted to access the variable of any class, like using 'object.variablename', here 'human1.name'
		
		System.out.println(human2.name); // here we are accessing the 'name' attribute/variable of human class for its obj human2
		
		human2.eat();
		human1.drink();
	}

}
