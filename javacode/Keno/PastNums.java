import java.util.Random;

/**
 * Super class of Grid.java. Will contain information
 * on the 100 past games before user plays. This is
 * used to hold information for hot and cold number
 * determinations.
 * 
 * @author Alex Maureau
 * Reviewing Java
 * http://www.cstutoringcenter.com
 */
public class PastNums{
	//public past drawn numbers and parallel array to hold indexes
	public int drawn_times[], drawn_index[];
	
	/**
	 * Constructor. Will create new arrays and fill information
	 * via the use of the sim100() method
	 */
	public PastNums(){
		drawn_times = new int[81];
		drawn_index = new int[81];

		//fill arrays
		for(int i = 1; i < 81; i++) {
			drawn_times[i] = 0;
			drawn_index[i] = i;
		}

		//simulate last 100 draws
		sim100();
	}

	/**
	 * Method to simulate last 100 games to help determine
	 * hot and cold numbers
	 */
	public void sim100() {
		Random r = new Random();
		//run 100 past games of numbers
		for(int i = 0; i < 100; i++) {
			//20 numbers are drawn in a game
			for(int j = 1; j <= 20; j++) {
				drawn_times[ r.nextInt(80) + 1] ++;
			} //j
		} //i
	} //sim100
} //class