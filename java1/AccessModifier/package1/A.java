package package1;
import package2.*;

public class A
{

	protected String protectedMessage = "this is protected";
	
	public static void main(String[] args)
	{
		
		
		C c = new C(); // NOTE : if we remove public keyword from class definition of C, we no longer can create an object of class C in class A
		//since C is in pack2 and A is in pack1
		System.out.println(c.defaultMessage); //cannot access defaultMessage of class C from package2 here in class A from package1
		System.out.println(c.publicMessage);
	}

}
