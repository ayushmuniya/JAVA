public class Main
{

	public static void main(String[] args)
	{
		Car car1 = new Car("Chevrolet","Camaro",2021); //car1 object
		Car car2 = new Car("Ford","Mustang",2022); //car2 object
		
		/* how to copy the object*/
		
		car1 = car2; // this will make the address of both the object same
		
		//output
		//Car@5a07e868
		//Car@5a07e868
		
		/*correct method to copy the object*/
		
		car2.copy(car1);
		
		
		System.out.println(car1); // when we directly pass the object in print statement, it will output the address where this object is stored
		System.out.println(car2);
		
		System.out.println(); //white space 
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		System.out.println();// white space
		
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());		
	
	}

}
