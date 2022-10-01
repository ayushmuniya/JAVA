
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car car = new Car(); //creating an object of class 'Car'
		car.go(); //calling the go method, which the class 'Car' has inherited from the class 'Vehicle'
		
		Bicycle bicycle = new Bicycle(); //creating an object of class 'Bicycle'
		bicycle.stop(); //calling the stop method, which the class 'Car' has inherited from the class 'Vehicle'
		
		System.out.println(car.speed); //accessing the speed variable, which the class 'Car' has inherited from the class 'Vehicle'
		System.out.println(bicycle.speed); //accessing the speed variable, which the class 'Bicycle' has inherited from the class 'Vehicle'
		
		System.out.println(car.doors);
		System.out.println(bicycle.pedals);
		
		
	}

}
