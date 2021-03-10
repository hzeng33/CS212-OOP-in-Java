/**
 * Baseball.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Baseball extends Team{
	//each team has a coach
	private String coach;
	
	//MLB rules state there are 162 games in a season
	private final double NUM_GAMES = 162;
	
	//boolean to check if we played the season yet
	private boolean season_played;

	//two argument constructor, taking the team name & coach
	public Baseball(String n, String c){
		super(n);
		coach = c;
		season_played = false;
	}

	//method to calculate teams' winning percentage
	private double winPercent() {
		return (double)getWins() / NUM_GAMES;
	}

	//method to simulate the baseball teams' season
	public void playSeason() {

		Random r = new Random();
		int wins = 0, losses = 0;

		//loop through the number of games in the season
		for(int i = 1; i <= NUM_GAMES; i++) {
			//50/50 chance of winning
			if(r.nextDouble() <= 0.5) {
				wins++;
			}else {
				losses++;
			}
		}
		//set wins and losses for the team
		this.setWins(wins);
		this.setLosses(losses);
		
		//season has been played so set variable to true
		season_played = true;
	}

	//overloaded toString method. Want to check if season has been 
	//played yet. If so, print the wins, losses and win percentage
	public String toString() {

		//get winning percentage for team
		double wp = winPercent();

		//response String
		String ans = "";

		//if we played the season, then print appropriate info:
		if(season_played) {

			ans += this.getClass().getName() + " team: " 
				+ getName() + "\nCoached by: " + coach + "\n" 
                  + "Wins: " + getWins() + "\n" 
                  + "Losses: " + getLosses() + "\n" 
                  + "Win percent: " + wp;

			//determine if we had a winning or losing season
			//a winning season is a win percentage of 0.5 or
			//greater. otherwise it’s a losing season
			if(wp < 0.5) 
				ans += "\nLosing season!";
			else 
				ans += "\nWinning season!";


		}else {

			//we did not play season so print basic information
			ans += this.getClass().getName() + " team: " 
			    + getName() + "\nCoached by: " + coach + "\n" 
                      + "Awaiting season results";
		}
		//return final String		
		return ans + "\n";
	}
} //Baseball class
