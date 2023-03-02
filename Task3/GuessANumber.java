import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		  // Create a Scanner object
        Scanner scan = new Scanner(System.in);

    	   // Read user input
        System.out.println("Please type a number:");
            //int input = scan.nextInt();    <-- if the input gets initialized here the termainl will ask for a number twice further down

            
            // if so...
            // if input was not numeric show an error message and call this method recursively
            //use hasNextDouble to check if input is numeric, 
        if(!scan.hasNextDouble()){
            System.out.println("You did not type a number");
            makeAGuess();

        }if(scan.hasNextDouble()){
                //initializing input here so the terminal doesnt ask for a number twice
            int input = scan.nextInt();
            System.out.println("Bravo. You typed the number: "+input);
 
                    //   Compare it with the random number
            if(input == rnd_number){

                System.out.println("You guessed right");
            }else{
                    //   Let the user know the result of the comparison
                System.out.println("You guessed wrong");
                
                    //   Help the user by revealing wether the guess was lower or higher than the target number
                if(input<rnd_number){
                    System.out.println("Your guess is lower than my number");
                }else if(input>rnd_number){
                    System.out.println("Your guess is higher than my number");
                }
                //   Let the user try again by calling this method recursively
                makeAGuess();

            }

        }

    }
   
}