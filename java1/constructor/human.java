
public class Human
{

	String name;
	int age;
	double weight;

	// constructor creating, its name should be same the class name
	Human(String shubhnaam, int umar, double vajan)
	{
		this.name = shubhnaam; // pretend that we are replacing 'this' keyword with human1 and if we create second object then human2.
		this.age = umar;
		this.weight = vajan;
	}

	void eat()
	{
		System.out.println(this.name + " is eating");
	}

	void drink()
	{
		System.out.println(this.name + " is drinking");
	}
}
