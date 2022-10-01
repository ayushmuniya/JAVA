public class Fish implements Prey, Predator
{

	@Override //here we are overriding the method we declared in Predator interface and creating its body here itself //this step is compulsory
	public void hunt()
	{
		// TODO Auto-generated method stub
		System.out.println("this fish is hunting smaller fish");
		
	}

	@Override //here we are overriding the method we declared in Prey interface and creating its body here itself //this step is compulsory
	public void flee()
	{
		// TODO Auto-generated method stub
		System.out.println("this fish is fleeing from larger fish");
		
	}

}
