public class Friend
{
	String name;
	int numberOfFriends; //removed static keyword

	Friend(String naam)
	{
		this.name = naam;
		numberOfFriends++;
	}

}
