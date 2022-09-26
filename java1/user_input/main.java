package user_input;
import java.util.Scanner;

public class user_input
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // creating an object named sc of class Scanner
		
		System.out.println("what is your name?");
		String name = sc.nextLine(); // calling the nextLine method of the newly creates object sc - its takes String in input
		
		System.out.println("what is your age?");
		int age = sc.nextInt(); // calling the nextInt method of the newly creates object sc - its takes integer as input
		
		sc.nextLine(); // to clear our scanner input box since we used nextInt above
		
		System.out.println("what is your favt food?");
		String food = sc.nextLine(); 
		
		System.out.println("hello " + name); // print
		System.out.println("you are " +age+ " year old");
		System.out.println("you like " + food);

	}

}
