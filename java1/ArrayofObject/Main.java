
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [] number = new int[3]; //normal way to create an array of integers 
		char[] characters = new char[4]; //normal way to create an array of characters 
		String[] strings = new String[5]; //normal way to create an array of strings
		
//		Food[] refrigerator = new Food[3]; //way to create an array of objects of class Food
		
		
		Food food1 = new Food("pizzza");
		Food food2 = new Food("hanbr");
		Food food3 = new Food("hotdog");
		
		Food[] refrigerator = {food1, food2, food3};
		
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0]); //output = Food@5a07e868 -> this is the address of array of objects in computer's memory
		
		System.out.println(refrigerator[0].name); //output = pizzza
		System.out.println(refrigerator[1].name); //output = hanbr
		System.out.println(refrigerator[2].name); //output = hotdog
	}

}
