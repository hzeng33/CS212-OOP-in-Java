/**
 * Team.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class Team{
	//instance variables. Every team in a sport
	//has a number of wins, losses and a team name

	private int num_wins, num_losses;
	private String name;

	//one argument constructor taking the team name
	//sets the num_wins and num_losses to 0 as no season has been
	//played yet.
	public Team(String n){
		name = n;
		num_wins = num_losses = 0;
	}

	//get methods
	public String getName() { return name; }	
	public int getWins() { return num_wins; }
	public int getLosses() { return num_losses; }

	//set methods
	public void setWins(int w) { num_wins = w; }
	public void setLosses(int l) { num_losses = l; }
} //Team
