public class Main
{
	public static void main(String argrs[])
	{
		Friend friend1 = new Friend("sponegbob");
		Friend friend2 = new Friend("patrick"); 
		//so here both, friend1 and friend2 are sharing the same numberOfFriends variable bcoz there is only a single copy and class itself owns the member
		
		System.out.println(Friend.numberOfFriends);
		//output here = 2// since we called/accessed the numberOfFriends 2 times as above and therefore its value get incremented (as defined in constructor)
		
		Friend friend3 = new Friend("squidward");
		
		System.out.println(Friend.numberOfFriends); //accessing static variable 
		// to access the static member of any class, we do not have to create any object of that class in order to access the member/variable/method
		//we can directly access it using 'classname.variablename' as shown.
		//output here = 3 //since all the instance of the class is sharing the same copy of numberOfFriends, which get updated/incremented every time we call it.
		
		System.out.println(friend3.numberOfFriends); //read warning
		//we can access the static variable by using object of the class also as we used to do, but its not recommended
		
		Friend.displayFriends();// calling static method 'displayFriends()' , by directly using the class 'Friend' as Friend.displayFriends()
		
//		Math.round(a); //round is a static method of class 'Math' and so we can directly call it without creating its object by directly using class name as shown
		
		
	}
}
