
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Gararge garage = new Gararge();// creating an object named 'garage' of class Gararge 

		Car car1 = new Car("BWM"); //passing a String as an argument to constructor/method, of class 'Car'
		Car car2 = new Car("Tesla"); //since while defining the constructor we mentioned that a String should be passed an an argument
		
		//some chedchad
		Car car3 = new Car("Mecz", "White");
		Car car4 = new Car("Audi", "Blue");
		
		
		garage.park(car1); // passing object 'car1' of class 'Car' as an arguments, in the a method 'park'
		garage.park(car2); // passing object 'car2' of class 'Car' as an arguments, in the a method 'park'
		
		garage.park(car3); //chedchad
		garage.park(car4); //chedchad

	}

}
