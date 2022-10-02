import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age");
		int age = scan.nextInt();

		// exception handling block/function
		try 
		{
			checkAge(age);
		} 
		catch (Exception e)
		{
			System.out.println("A prob occured" + e);
		}

	}
	
	//exception handling method
	static void checkAge(int age) throws AgeException
	{
		if (age < 18)
		{
			throw new AgeException("\n" + "you must be 18+ to signup");
		} 
		else
		{
			System.out.println("you are now signed in");
		}

	}

}
