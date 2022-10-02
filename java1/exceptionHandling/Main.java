import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		try // put all the dangerous code in try 
		{
			// TODO Auto-generated method stub
		
			System.out.println("enter a whole number");
			int x = scanner.nextInt();
		
			System.out.println("enter a whole number to divide");
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("result" + z);
		}
		catch(ArithmeticException e) // we catch the ArithmeticException we got and prompted a response towards it to user
		{
			System.out.println("you cannot divide by zero! idiot");
		}
		catch(InputMismatchException e) // we catch the InputMismatchException we got and prompted a response towards it to user
		{
			System.out.println("please enter the number mf");
		}
		catch(Exception e) // this catch all the exception and repose a general error 
		{
			System.out.println("something went wrong");
		}
		
		finally {
			System.out.println("this will always print");
			scanner.close();
		}
	}

}
