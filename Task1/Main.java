			//1.a Create a class Main with a main method.
class Main{
	
	public static void main(String [] args){
	
			//1.g From the main method in the Main class, create an 
			//instance of the Team class (instantiate the Team class).

		Team team1 = new Team("Team1");
		Team team2 = new Team("Team2");
		Team team3 = new Team("Team3");
		Team team4 = new Team("Team4");
		Team team5 = new Team("Team5");

			//1.i From the main method, call the method setRank on the instance of Team you 
			//created in step 1.g with a number of your choice.

		team1.setRank(1);
		team2.setRank(2);
		team3.setRank(3);
		team4.setRank(4);
		team5.setRank(5);

			//Adding player til the ArrayList
		team1.addPlayer("Youssef");
		team1.addPlayer("Hanni");
		team1.addPlayer("Ahmad");
		team1.addPlayer("Lasse");

			

			//	.toString() is not nescecerry to add as we have created a method to override the toString.
		System.out.println(team1);
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		

	}


}