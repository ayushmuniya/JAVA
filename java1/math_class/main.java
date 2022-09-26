package math;
import java.util.Scanner;

public class math
{
	public static void main(String args[])
	{
		double x = 3.14;
		double y = -10;
		
		double z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the side x:");
		x = sc.nextDouble();
		
		System.out.println("enter the side y:");
		y= sc.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y)); // using he methods defined in Math class -> here sqrt
		
		System.out.println("hypotnoues is: " +z);
	}

}
