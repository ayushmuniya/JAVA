//array is used to store multiple values within a single variable

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] cars = {"abs" , "def"};
		
		cars[0] = "mustang";
		
		String[] bike = new String[3];
		
		bike[0] = "bmw";
		bike[1] = "KTM";
		
		System.out.println(bike[0]);
		
		for(int i=0; i< cars.length; i++ ) {
			System.out.println(cars[i]);
		}

	}

}
