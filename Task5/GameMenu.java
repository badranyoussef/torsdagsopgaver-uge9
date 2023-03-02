import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{


		//4.b Add a private instance variable, actions of type ArrayList<String> to the class.	
	private ArrayList<String> action;


		//4.c Add a constructor with a parameter of type ArrayList. This is so that the GameMenu class can be instantiated with a list of actions.(shown in step 4.f)
	
	GameMenu(ArrayList<String>action){
		//4.d In the GameMenu contructor, assign the list received as an argument, to the instance variable actions.
	this.action = action;
}


		//4.h In the GameMenu class add a method displayMenu that prints out the elements of the actions attribute.
	public void displayMenu(){
		for(String s: this.action){
		System.out.println(s);
		}


		
		}
			/*5.a Create a method in the GameMenu class, getAction that prints the sentence 
			"Type a number to choose an action" and then prints each elements in the options attribute. */
		public String getAction(){
			displayMenu();
			System.out.println("Type a number to choose an action ");

			Scanner scan = new Scanner(System.in);
			
			String choice = scan.nextLine();
			return choice;
	}
}