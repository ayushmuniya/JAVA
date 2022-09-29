import java.util.Random;

public class DiceRoller
{
	Random random; // way2 : declare the obj/instance of the Random class and variable outside the constructor DiceRoller()
	int number;

	DiceRoller()
	{
		random = new Random();
		roll(); // now roll() method has access to Random random and int number as they are not..
				// ..declared as global (i.e outside the constructor DiceRoller() and with the class DiceRoller
	}

	void roll()
	{
		number = random.nextInt(6) + 1;
		System.out.println(number);

	}
}
