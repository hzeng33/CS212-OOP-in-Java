import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

/**
 * Game.java
 *
 * Class for playing a game of Keno. Will contain information for:
 *  1. The grid of numbers in the game
 *  2. The amount of numbers the player wants to play
 *  3. How many games the user wants to play
 *  4. How much they are betting per game played
 *  
 * @author Alex Maureau
 * Reviewing Java
 * http://www.cstutoringcenter.com
 */
class Game {
	//the grid of numbers
	private Grid grid;
	
	//user entries (or quick pick numbers)
	private int entries[];
	
	//needed variables
	private int nums_played = 0, games_played = 0, 
			pergame_played = 0, total_wager = 0, 
			game_id = 0;

	//LocalTime object, used to generate game_id
	private LocalTime time;
	
	/**
	 * Constructor. Creates a new Grid of numbers, which also
	 * invokes the inherited PastNums constructor, creating the 100
	 * past games
	 */
	public Game(){ 
		//start a new grid here, which also generates 100 past drawn games
		grid = new Grid();
	} //constructor

	//get methods
	public int getGamesPlayed() { return games_played; }
	public int getTotalWager() { return total_wager; }

	//method to detect if number was drawn in a game
	private boolean isDrawn(int n) {
		for(int i = 1; i < entries.length; i++)
			if(n == entries[i]) return true;
		return false;
	} //isDrawn

	//print the numbers the user has for a game
	private void printEntries() {
		System.out.print("Your numbers: ");
		for(int i = 1; i <= entries.length-1; i++)
			System.out.print(entries[i] + " ");

		System.out.println();
	} //printEntries

	/**
	 * First game of the session so gather information for the
	 * 	1. Amount of numbers the user wants to play (1-10)
	 *  2. Whether or not the user wants a Quick Pick or to enter
	 *     their own numbers
	 *  3. How many consecutive games the user wants to play
	 *  4. The amount wagered per game
	 *  
	 * @param p the current Player for the game
	 */
	private void firstGame(Player p) {
		Scanner s = new Scanner(System.in);

		while(true) {
			
		System.out.print("How many numbers are you playing? (1 to 10): ");
		nums_played = s.nextInt();
		
		while(nums_played < 1 || nums_played > 10) {
			System.out.print("Try again please (1 to 10): ");
			nums_played = s.nextInt();
		}

		//create array based on the number choice
		//+1 on index to allow for 1 to 10
		entries = new int[nums_played+1];

		//printEntries();

		System.out.print("Quick pick? Y for Yes/N for No: ");
		char action = ' ';
		
		action = s.next().charAt(0);
		
		//invalid entry. try again
		while(action != 'Y' && action != 'y' 
		   && action != 'N' && action != 'n') {
			System.out.println("Invalid entry. Try again.");
			System.out.print("Y for yes/N for no: ");
			action = s.next().charAt(0);
		}

		if(action == 'Y' || action == 'y') {
			//quick pick numbers
			Random qp = new Random();
		
			//first number
			entries[1] = qp.nextInt(80) + 1;
			
			//QP up to nums times. if only 1 number is chosen, loop will not run
			for(int i = 2; i <= nums_played; i++) {
				int temp = qp.nextInt(80) + 1;
				//if number is in the array already, then keep drawing a new one
				while(isDrawn(temp)) {
					temp = qp.nextInt(80) + 1;
				}
				entries[i] = temp;
			}			
			//desired number of entries so continue
		}else if(action == 'N' || action == 'n'){
			//choosing numbers
			//first number entry:
			System.out.print("Entry 1: ");
			int temp = s.nextInt();

			while(temp < 1 || temp > 80) {
				System.out.print("Try entry 1 again: ");
				temp = s.nextInt();				
			}
			entries[1] = temp;
						
			//if only one number is being entered 
			//then loop will not run
			for(int i = 2; i <= nums_played; i++) {
				//error check entry here. otherwise
				System.out.print("Entry " + i + ": ");
				temp = s.nextInt();
				
				while(isDrawn(temp) || (temp < 1 || temp > 80)) {
					System.out.print("Try entry " + i + " again: ");
					temp = s.nextInt();
				}

				//otherwise good entry
				entries[i] = temp;
			}
		}

		//how many consecutive games does the user want to play
		System.out.print("How many games consecutive games are you playing? (1-10): ");
		games_played = s.nextInt();
		
		//error check for games_played
		while(games_played <= 0 || games_played > 10) {
			//try again for consecutive games
			System.out.print("Try again please. " 
					+ "How many games consecutive games are you playing? "
					+ "(1-10): ");
			games_played = s.nextInt();			
		}
		
		System.out.print("How much per game? (1, 2, 5, 10 or 20): ");
		pergame_played = s.nextInt();

		//error check for pergame_played
		while(pergame_played != 1 && pergame_played != 2 
		   && pergame_played != 5 && pergame_played != 10
		   && pergame_played != 20) {
			//try again for consecutive games
			System.out.print("Try again please. " 
					+ "How much per game? (1, 2, 5, 10 or 20): ");
			pergame_played = s.nextInt();			
		}

		//total wager is the number of games played times amount per game
		total_wager = pergame_played * games_played;

		System.out.println("Total wager will be $" + total_wager);
		System.out.print("Confirm bet? Y for yes/N for no: ");
		action = s.next().charAt(0);

		//invalid entry. try again
		while(action != 'Y' && action != 'y' 
		   && action != 'N' && action != 'n') {
			System.out.println("Invalid entry. Try again.");
			System.out.print("Y for yes/N for no: ");
			action = s.next().charAt(0);
		}
		
		if(action == 'Y' || action == 'y') {
			//if the wager is more than the current bankroll
			//throw the exception, which will terminate game
			if(p.getBankroll() - total_wager < 0)
				throw new BankrollException("Not enough to make wager");
			else
				p.setBankroll(-total_wager);

			//break loop
			break;
		}else if(action == 'N' || action == 'n') {
			//go back to beginning of loop
			continue;
		}
				
		} //while
	} //firstGame

	/**
	 * Method to play the game. If played_game is true
	 * then we do not need to setup a new game.
	 * 
	 * @param played_game represents whether we played a game already
	 * @param p the current Player for the game
	 */
	public void play(boolean played_game, Player p) {
		//playing a game to repeat numbers
		if(!played_game) {
			firstGame(p);
		}

		System.out.println("Good luck!");
		System.out.println();

		//game_id is unique based on time of day
		time = LocalTime.now();
		game_id = time.toSecondOfDay();

		System.out.println("Now playing game " + game_id);
		System.out.println();

		//otherwise print entries and draw numbers
		printEntries();

		System.out.println();

		//shuffle numbers and print the grid to the console
		grid.shuffle();
		grid.printGrid(entries);
	} //play

	/**
	 * Method to determine which numbers are hot,
	 * meaning they have been the most frequently drawn
	 * 
	 * Prints out the 10 hottest numbers
	 * 
	 * Uses selection sort for the parallel arrays
	 */
	public void hotNumbers() {
		//copies of current arrays from Grid class
		int[] hot = grid.drawn_times;
		int hot_index[] = grid.drawn_index;
		
		System.out.println("HOT NUMBERS: ");
		
		//selection sort by highest to lowest
		for(int i = 1; i < hot.length-1; i++){
			int indexMax = i;
			for(int j = i+1; j < hot.length; j++){
				if(hot[j] >= hot[indexMax]) indexMax = j;
			}	
			//found the highest elements index so swap here:
			if(hot[i] != hot[indexMax]){
			       int temp = hot[i];
			       hot[i] = hot[indexMax];
			       hot[indexMax] = temp;
			       
			       int temp2 = hot_index[i];
			       hot_index[i] = hot_index[indexMax];
			       hot_index[indexMax] = temp2;
			}			
		}

		//print the 10 hottest numbers
		for(int i = 1; i <= 10; i++)
			System.out.print(hot_index[i] + " ");
		System.out.println();
	} //hotNumbers

	/**
	 * Method to determine which numbers are cold,
	 * meaning they have been the least frequently drawn
	 * 
	 * Prints out the 10 coldest numbers
	 * 
	 * Uses selection sort for the parallel arrays
	 */
	public void coldNumbers() {
		//copies of current arrays from Grid class
		int[] cold = grid.drawn_times;
		int[] cold_index = grid.drawn_index;
		
		System.out.println("COLD NUMBERS: ");

		//selection sort by lowest to highest
		for(int i = 1; i < cold.length-1; i++){
			int indexMin = i;
			for(int j = i+1; j < cold.length; j++){
				if(cold[j] <= cold[indexMin]) indexMin = j;
			}
			//found the smallest elements index so swap here:
			if(cold[i] != cold[indexMin]){
			       int temp = cold[i];
			       cold[i] = cold[indexMin];
			       cold[indexMin] = temp;

			       int temp2 = cold_index[i];
			       cold_index[i] = cold_index[indexMin];
			       cold_index[indexMin] = temp2;
			}
		}

		//print the 10 coldest numbers
		for(int i = 1; i <= 10; i++)
			System.out.print(cold_index[i] + " ");
		System.out.println();
	} //coldNumbers

	/**
	 * Method will check for the number of matches the Player
	 * has from their game.
	 * 
	 * @return total amount of the win for user
	 */
	public int checkWin() {
		//checking the entries array for the 
		//number of matches the Player has
		int matches = 0;
		for(int i = 1; i < entries.length; i++) {
			for(int j = 1; j <= 20; j++) {
				//if number from player has been drawn
				if(entries[i] == grid.grid[j]) {
					matches++;
					break;
				}
			}
		}

		//get win based on pay table
		int total_win = payTable(matches);

		//print win information
		System.out.println();
		System.out.println("You matched " + matches + " numbers.");
		System.out.println("Total game wager: $" + pergame_played);
		System.out.println("Amount won: $" + total_win);

		//return the amount of the win based on the number of matches
		return total_win;
	} //checkWin

	/**
	 * Method to determine the amount of the win based on the 
	 * number of matches provided
	 * 
	 * @param matches number of matches player has in their game
	 * @return total amount of the win
	 */
	private int payTable(int matches) {
		int total_win = 0;

		//determine win based on number of games played
		//grid determined via NY Lottery payouts
		switch(nums_played) {
		case 1: //1 spot game
			if(matches == 1) {
				total_win = 2 * pergame_played;
			}
			break;
			
		case 2: //2 spot game
			if(matches == 2) {
				total_win = 10 * pergame_played;
			}
			break;
			
		case 3: //3 spot game
			if(matches == 2) {
				total_win = 2 * pergame_played;
			}else if(matches == 3) {
				total_win = 23 * pergame_played;				
			}
			break;
			
		case 4: //4 spot game
			if(matches == 2) {
				total_win = 1 * pergame_played;
			}else if(matches == 3) {
				total_win = 5 * pergame_played;
			}else if(matches == 4) {
				total_win = 55 * pergame_played;
			}
			break;

		case 5: //5 spot game
			if(matches == 3) {
				total_win = 2 * pergame_played;
			}else if(matches == 4) {
				total_win = 20 * pergame_played;
			}else if(matches == 5) {
				total_win = 300 * pergame_played;
			}
			break;

		case 6: //6 spot game
			if(matches == 3) {
				total_win = 1 * pergame_played;
			}else if(matches == 4) {
				total_win = 6 * pergame_played;
			}else if(matches == 5) {
				total_win = 55 * pergame_played;
			}else if(matches == 6) {
				total_win = 1000 * pergame_played;
			}
			break;

		case 7: //7 spot game
			if(matches == 0) {
				total_win = 1 * pergame_played;
			}else if(matches == 4) {
				total_win = 2 * pergame_played;
			}else if(matches == 5) {
				total_win = 20 * pergame_played;
			}else if(matches == 6) {
				total_win = 100 * pergame_played;
			}else if(matches == 7) {
				total_win = 5000 * pergame_played;
			}
			break;

		case 8: //8 spot game
			if(matches == 0) {
				total_win = 2 * pergame_played;
			}else if(matches == 5) {
				total_win = 6 * pergame_played;
			}else if(matches == 6) {
				total_win = 75 * pergame_played;
			}else if(matches == 7) {
				total_win = 550 * pergame_played;
			}else if(matches == 8) {
				total_win = 10000 * pergame_played;
			}
			break;

		case 9: //9 spot game
			if(matches == 0) {
				total_win = 2 * pergame_played;
			}else if(matches == 5) {
				total_win = 5 * pergame_played;
			}else if(matches == 6) {
				total_win = 20 * pergame_played;
			}else if(matches == 7) {
				total_win = 125 * pergame_played;
			}else if(matches == 8) {
				total_win = 3000 * pergame_played;
			}else if(matches == 9) {
				total_win = 30000 * pergame_played;
			}
			break;

		case 10: //10 spot game
			if(matches == 0) {
				total_win = 5 * pergame_played;
			}else if(matches == 5) {
				total_win = 2 * pergame_played;
			}else if(matches == 6) {
				total_win = 10 * pergame_played;
			}else if(matches == 7) {
				total_win = 45 * pergame_played;
			}else if(matches == 8) {
				total_win = 300 * pergame_played;
			}else if(matches == 9) {
				total_win = 5000 * pergame_played;
			}else if(matches == 10) {
				total_win = 100000 * pergame_played;
			}
			break;
		} //switch
		
		return total_win;
	} //totalwin
} //Game