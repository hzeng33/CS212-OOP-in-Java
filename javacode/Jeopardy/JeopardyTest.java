/**
 * JeopardyTest.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Appendix E
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class JeopardyTest{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int games = 0, score = 0;

		//prompt user for entry
		System.out.println("This is JEOPARDY! Please enter # of "
			 + "games to play (between 1 - 100): ");
		games = s.nextInt();

		//error checking
		if(games > 100) games = 100;
		if(games < 1) games = 1;

		//start new game
		Jeopardy game = new Jeopardy();

		//loop to run for the amount of games desired
		for(int i = 0; i < games; i++){
			System.out.println("Game #" + (i+1));

			//play round 1
			game.clear();
			game.dailyDoubles(1);
			game.questions(1);

			score = game.getSumRd1();

			System.out.println("Round 1 end score: " + score);

			//play round 2
			game.clear();
			game.dailyDoubles(2);

			//Start round 2 the amount won from round 1:
			game.setSumRd2(score);
			game.questions(2);

			score = game.getSumRd2();

			System.out.println("Round 2 end score: " + score);

			//Final Jeopardy. Just double the game score:
			score *= 2;

			System.out.println("Final Jeopardy result: " 
                         + score);
			System.out.println();

			//reset the variables for the next game:
			game.setSumRd1(0);
			game.setSumRd2(0);
		}
	} //main
} //class
