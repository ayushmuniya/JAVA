package objects;

public class Main
{

	public static void main(String[] args)
	{

		// TODO Auto-generated method stub

		Car myCar1 = new Car();
		Car myCar2 = new Car();

		System.out.println(myCar1.color);
		System.out.println(myCar1.make);

		System.out.println();

		System.out.println(myCar2.color);
		System.out.println(myCar2.make);

		myCar1.drive();
		myCar1.brake();
	}

}
