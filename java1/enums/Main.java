enum Planet
{
	MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUIPTER(5), SATURN(6), URANUS(7), NEPTUNE(8), PLUTO(9);

	int number;

	Planet(int number) //creating a constructor of enum, kind of like a constructor of class
	{
		this.number = number;
	}
}

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		Planet myPlanet = new Planet(); // what we used to do in classes

		Planet myPlanet = Planet.MARS;

		canILiveHere(myPlanet);

	}

	static void canILiveHere(Planet myChakra) // passing our enum as an argument and creating its instance here called myChakra
	{
		switch (myChakra)
		{
		case EARTH:
			System.out.println("you can live here " + "and the number of the planet is " + myChakra.number);
			break;
		default:
			System.out.println("you cant live here " + "and the number of the planet is " + myChakra.number);
			break;

		}
	}
}
