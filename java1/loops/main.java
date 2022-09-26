//while loop

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// while loop = executes a block of code as long as a it's condition remains true

		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		System.out.println("Welcome "+name);
		
	}
}

-------------------------------------------------------------------------------------------------------------------------------
  
  // for loop
  
  public class Main {

	public static void main(String[] args) {
		
		// for loop = executes a block of code a limited amount of times
		
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Happy new year!");
		
	}
}

--------------------------------------------------------------------------------------------------------------------------------
  
  // nested loop
  
  import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// nested loops = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns;j++) {
				System.out.print(symbol);
			}
		}	
	}
}
