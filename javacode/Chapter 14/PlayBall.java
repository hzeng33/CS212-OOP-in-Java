/**
 * PlayBall.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class PlayBall{
	public static void main(String args[]){
		//setup new teams
		Basketball team1 = 
				new Basketball("Knicks", "David Fizdale");
		Baseball team2 = 
				new Baseball("Mets", "Terry Collins");
		Team team3 = 
				new Basketball("Heat", "Eric Spolstra");

		//print current teams
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);

		//play the season
		team1.playSeason();
		team2.playSeason();
		
		//print current teams
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
	} //main
} //class
