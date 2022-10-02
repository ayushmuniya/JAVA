
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();

		/*racers={car,bicycle,boat};*/
		// storing our objects in an array
		// here is a problems -> what will be the data type of this array??
		// we solve this using polymorphism
		// since all this objects also identify as Vehicle (super class)

		Vehicle[] racers =
		{ car, bicycle, boat };

		car.go();
		bicycle.go();
		boat.go();

		// better way
		// for loop to iterate through all of this elements of array

		for (Vehicle x : racers) // Vehicle as data type, x as our counter and name of the array as racers
		{
			x.go();
		}
	}

}
