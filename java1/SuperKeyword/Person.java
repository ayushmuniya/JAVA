
public class Person
{
	String name;
	int age;

	Person(String name, int age) // we got the name and age attributes from super(name,age) mentioned in child class
	{
		this.name = name;
		this.age = age;

	}
	
	//way2
	public String toString() 
	{
		return this.name + "\n" + this.age + "\n";
	}
}
