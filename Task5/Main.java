import java.util.ArrayList;


	//4.e Create a client class, Main with a main method. (You will use this class to test the GameMenu class) after the next step.
class Main{
	
	public static void main(String[] args){

			/*4.f In the main method create an ArrayList of type String called actions. Don't forget to import the ArrayList class. Add the following String values to the actions ArrayList:
				"1) Start game"
				"2) Resume game"
				"3) Pause game"
				"4) End game"
			*/
		ArrayList<String> actions = new ArrayList<>();

		actions.add("1 .Start game");
		actions.add("2. Start Resume game");
		actions.add("3. Start Pause game");
		actions.add("4. Start End game");

		//System.out.println(actions.get(2)); // expected output: "Pause game"

			//4.g Still in the main method, instantiate the GameMenu class with the actions reference as an argument to the constructor.
		GameMenu game1 = new GameMenu(actions);

			//4.i From the main method in Main, test the displayMenu method by calling it on the GameMenu instance created in step 4.g.
		//game1.displayMenu();

		String userChoice = game1.getAction();
		int userChoiceInt = Integer.parseInt(userChoice);

			doAction(userChoiceInt);


	}

		public static void doAction(int action){

			String msg = "";

			switch(action){

			case(1):
				msg = "Starting the game now";
				break;
			case(2):
				msg = "Fetching previously saved game data";
				break;
			case(3):
				msg = "Game paused";
				break;
			case(4):
				msg = "End game";
				break;
			}

			System.out.println(msg);
		}

}