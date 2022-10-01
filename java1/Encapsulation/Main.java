
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car car = new Car("Cheverlot", "camaro", 2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		car.setYear(2021);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());

	}

}
