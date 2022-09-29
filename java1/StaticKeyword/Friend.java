public class Friend
{
	String name;
	static int numberOfFriends; //static variable

	Friend(String naam)
	{
		this.name = naam;
		numberOfFriends++;
	}

	static void displayFriends() //static method
	{
		System.out.println("you have" +numberOfFriends+ " friends");
	}
	
}
