import java.util.Scanner;

				//2.a: create a Main class with a main method.
class Main{
	
	public static void main(String[] args){
		
				//2.b: In the main method start by printing a message to the user: "Please type your name".
		String s = "Please type your name";
		System.out.println(s);

				//2.c: Create a Scanner object for reading the command line (remember to import the Scanner class from the util library: import java.util.Scanner; )
		Scanner scan = new Scanner(System.in);

				//2.d: Declare a String variable, name and assign it the content of the scanner's call to nextLine().
				//nedenstående kode gør at terminalen vil vente på at der indtastes en String
		String name = scan.nextLine();


				//2.e: Print the name of the user in a greeting, followed by the message "Please type your age"
		System.out.println("Hello "+s+"."+" Please type in your age.");
		
				/*2.f: Declare another variable of type int, age and assign it the value returned by the nextInt 
				method of the Scanner object. (you may reuse the Scanner object created in 2.c).*/
				////nedenstående kode gør at terminalen vil vente på at der indtastes en int
		int age = scan.nextInt();

		System.out.println("Your age is: "+age);

		int retireAge = 67;

		System.out.println("Your can retire in: "+(retireAge-age));

	}

}