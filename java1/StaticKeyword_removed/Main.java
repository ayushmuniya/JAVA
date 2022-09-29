public class Main
{
	public static void main(String argrs[])
	{
		Friend friend1 = new Friend("sponegbob");
		Friend friend2 = new Friend("patrick"); 
		Friend friend3 = new Friend("squidward");
		
		System.out.println(friend1.numberOfFriends); 
		//since we removed the static keyword from the variable numberOfFriends, we only can now access it using the object of the class
		//output = 1 // since now every object of class has its own copy of numberOfFriends 
		
		System.out.println(friend2.numberOfFriends); //output = 1 //there is no effect of increment as every object owns a copy and it does'nt get updated
		System.out.println(friend3.numberOfFriends); //output = 1 
		
	}
}
