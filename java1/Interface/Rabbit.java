
public class Rabbit implements Prey // Rabbit is going to use this interface called Prey
{

	@Override //here we are overriding the method we declared in Prey interface and creating its body here itself //this step is compulsory
	public void flee()
	{
		// TODO Auto-generated method stub
		System.out.println("the rabbit is fleeing");
		
	}
	
}
