package random_no_generation;
import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
  //int x = random.nextInt(6); // if we want to limit the number range, we can pass on the max range value in nextInt(6) , here 6;
		//but the above will generate random numbers from 0 to 5, so we add +1 as shown below to make it from 1-6 -> Dice example
		
		int x = random.nextInt(6)+1; // using methods of Random class or in other term methods of obj 'random'of class 'Random'
		
		double y = random.nextDouble();
		
		boolean z = random.nextBoolean();
		
		System.out.println(z);
	}

}
