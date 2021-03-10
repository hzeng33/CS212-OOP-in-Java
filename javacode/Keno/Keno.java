import java.util.Scanner;

/**
 * Keno.java
 * 
 * Program will simulate a game of Keno. It will prompt
 * a user with a menu of options. If the user plays a 
 * game, program creates a new Grid, in addition to generating
 * a past 100 drawn games to determine hot and cold numbers.
 * 
 * @author Alex Maureau
 * Reviewing Java
 * http://www.cstutoringcenter.com
 */
public class Keno {	
	//information on our Player
	private static Player p;
	
	//the game will be run here
	private static Game g;
	
	//the user entry
	private static char action;

	//have we played at least 1 game
	private static boolean played_game;

	//tracking how much we have won on a game and how
	//many total games we played
	private static int total_win, total_games_played;
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your name and bankroll:");

		//get name and bankroll from user
		String name = s.next();
		int bank = s.nextInt();

		//initial values
		action = ' ';
		played_game = false;
		
		try {
			//create a new Player with entered information
			p = new Player(name, bank);
			
			//create a new Game
			g = new Game();
			
			//initial values
			total_win = 0;
			total_games_played = 0;

			//keep playing the game until the user ends it
			while(true) {
				System.out.println("Please enter a character as seen at left.");

				//had played a game already so check if user wants to 
				//repeat numbers and bets
				if(played_game) {
					System.out.println("P -> Play new game");
					System.out.println("R -> Repeat last game");
					System.out.println("E -> Exit program");

					//user entry
					action = s.next().charAt(0);

					//user decides to end game so break the loop
					if(action == 'E' || action == 'e') {
						break;
					}else if(action == 'P' || action == 'p'){
						//playing a new game so set flag to false
						played_game = false;
						playGame();
					}else if(action == 'R' || action == 'r') {
						//repeating a game. need to check current bankroll
						//versus the total ticket wager. if it will get the 
						//bankroll to 0 or less, throw the exception and end game
						if(p.getBankroll() - g.getTotalWager() < 0) {
							throw new BankrollException("Error on repeat game: not enough to make repeat wager");
						}else {
							//otherwise update player bankroll
							p.setBankroll(-g.getTotalWager());
						}

						//we are repeating a played game so set flag
						played_game = true;
						
						//now play the game
						playGame();
					}
					
				}else {
					//first pass for a game
					System.out.println("P -> Play new game");
					System.out.println("E -> Exit program");

					//user entry
					action = s.next().charAt(0);

					//user decides to end game so break the loop
					if(action == 'E' || action == 'e') {
						break;
					}else if(action == 'P' || action == 'p'){
						//play first game so false flag
						played_game = false;

						System.out.println("You currently have $" + p.getBankroll());

						//now play the game
						playGame();
					}
					//if not the right entry, the code will go back to the top and ask again									
				}
			}
		}catch(Exception e) {
			//print error
			System.out.println(e);
		}

		//exit output		
		int starting = p.getStartingBankroll();
		int remains = p.getBankroll();

		System.out.println("Thank you for playing!");
		System.out.println("You played: " + total_games_played + " games");
		System.out.println("Remaining bankroll: $" + remains);
		
		if(remains - starting < 0) {
			System.out.println("Net loss: " + (remains - starting));
		}else if(remains - starting > 0) {
			System.out.println("Net win: " + (remains - starting));			
		}else { //even
			System.out.println("You are even!");
		}
	} //main

	/**
	 * Method to play X number of games as defined in Game.java
	 * 
	 * No arguments needed
	 */
	private static void playGame() {
		//play the game here
		g.play(played_game, p);
		
		//increase total games played
		total_games_played ++;

		//we have now played at least 1 game
		played_game = true;
		
		//will calculate the amount won. 0 has no effect
		//on player bankroll
		total_win = g.checkWin();
		
		//update bankroll with current win total. 0 has no effect
		p.setBankroll(total_win);

		//if only 1 game was selected to be played, show
		//the hot and cold numbers
		if(g.getGamesPlayed() == 1) {
			try {
				//short game break
				Thread.sleep(3000);

				//every 3 games, display hot and cold numbers
				if(total_games_played % 3 == 0) {
					System.out.println();
					g.hotNumbers();
					g.coldNumbers();								
					System.out.println();
				}
				
				//sleep 3 seconds before continuing
				Thread.sleep(3000);
			}catch(Exception e) {}

		}else {		
			//play rest of desired games.
			for(int i = 2; i <= g.getGamesPlayed(); i++) {
				try {
					//short break
					Thread.sleep(3000);

					//every 3 games, display hot and cold numbers
					if(total_games_played % 3 == 0) {
						System.out.println();
						g.hotNumbers();
						g.coldNumbers();								
						System.out.println();
					}
	
					//sleep 3 seconds
					Thread.sleep(3000);
	
					//5 second countdown clock
					System.out.print("Next game beginning in ");
					for(int j = 5; j > 0; j--) {
						System.out.print(j + "...");
						Thread.sleep(1000);
					}
					System.out.println();
				}catch(Exception e) {}
	
				//play the next game and increase count
				g.play(played_game, p);
				total_games_played ++;
				
				//now check the win amount
				System.out.println();
				total_win = g.checkWin();
				
				//update bankroll with current win total. 0 has no effect
				p.setBankroll(total_win);
			}
		}

		//display player information before deciding to 
		//play again or repeat game
		System.out.println();
		System.out.println(p);		
	} //playGame
} //class