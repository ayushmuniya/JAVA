public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
//		rabbit.hunt(); //hunt method is not available to rabbit as Rabbit class doesn't implements the interface Predator
		
		Hawk hawk = new Hawk();
		hawk.hunt();
//		hawk.flee(); //flee method is not available to hawk as Hawk class doesn't implements the interface Prey
		
		Fish fish = new Fish();
		fish.hunt(); //hunt method is available to fish as Fish class implements the interface Predator
		fish.flee(); //flee method is available to fish as Fish class implements the interface Prey

	}

}
