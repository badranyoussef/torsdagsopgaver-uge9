import java.util.ArrayList;	

	//1.b Create an entity class called Team.
class Team{

		//1.c Add a private instance variable a.k.a attribute to Team to hold the team name.
		//1.d Add another private instance variable to hold the Teams rank (some number).
		//1.e Add yet another private instance variable to hold the names of players in the team.
	private String teamName;
	private int rank;
	private ArrayList<String> teamPlayers;

		//1.f Add a constructor with a parameter, so that the Team can be instantiated with
		//a team name. Make sure the parameter value is assigned to the mathcing 
		//instance variable.
	public Team(String teamName){
			this.teamName = teamName;
			this.teamPlayers = new ArrayList<>();

	}

		//1.h In the Team class add a method called setRank that takes a number and assigns 
		//it to the rank attribute.
	public void setRank(int rank){
		this.rank = rank;

	}

		//1.j In the Team class add a toString method that returns a String formated like this:
		//"Hold: De Uovervindelige Rang: 3"
		//(Precise wording will depend on the name and rank of the Team instance you have created in step 1.g)

	public int getRank(){
	return rank;
	}

	public String getTeamName(){
	return teamName;
	}


	public void addPlayer(String playerName){
		teamPlayers.add(playerName);

	}

	public String toString(){
		String s = "Team name: "+getTeamName()+" Rank: "+getRank();
				// et for each loop for at tilføje spillere
		for(String i: this.teamPlayers){
				// "\n" for at skifte til næste linje
			s+="\n" +i;
		}
		
		return s;

	}


}