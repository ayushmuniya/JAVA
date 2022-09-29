package toString;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println(car); //output before overriding toString method = Car@5a07e868 -> this is the address of the car object in computer's memory
		
		System.out.println(car.toString()); //output before overriding toString method, remains same, bcoz behind the scenes we call the toString() method implicitly when we do println statement
		
		//now when we call toStirng method after overriding in Main, we will get output = Ford Mustang red 2021
	}

}
