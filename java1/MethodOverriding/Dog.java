public class Dog extends Animal
{
	@Override
	void speak() //Overridden method, as the same method is also available in its parent class 'Animal'
	{
		System.out.println("the dog goes bark");
	}
}
