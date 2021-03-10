import java.util.Random;

/**
 * Grid.java
 *
 * Class to hold information for the grid of 80 numbers.
 * Extends PastNums, to allow for previously drawn numbers
 * 
 * @author Alex Maureau
 * Reviewing Java
 * http://www.cstutoringcenter.com
 */
class Grid extends PastNums{
	//grid of numbers
	public int grid[];

	/**
	 * Constructor. Invokes PastNums constructor first
	 * and creates a new grid of numbers.
	 */
	public Grid(){
		super();
		
		//to allow for actual numbers 1-80
		grid = new int[81];
		
		//loop through to set all to loop counter
		for(int i = 1; i < 81; i++) {
			grid[i] = i;
		}
	}

	/**
	 * Randomly shuffles the grid of numbers. 
	 * The first 20 numbers in the grid after the shuffle 
	 * are the ones being drawn for the next game.
	 */
	public void shuffle() {
        int n = grid.length, temp = 0;
        Random random = new Random();
        random.nextInt();
        for (int i = 1; i < n; i++) {
            int change = i + random.nextInt(n - i);
            temp = grid[i];
            grid[i] = grid[change];
            grid[change] = temp;
        }
        
        //first 20 numbers in the array are drawn so update totals
        for(int i = 1; i <= 20; i++)
        	super.drawn_times[i] ++;
	}

	/**
	 * Method to determine if a number was drawn in a particular game
	 * when printing the grid to the console.
	 * 
	 * If so, return true, else false.
	 * 
	 * @param num the number to check
	 * @return true if num was drawn in a game
	 */
	private boolean wasDrawn(int num) {
		boolean drawn = false;
		for(int i = 1; i <= 20; i++)
			if(grid[i] == num) {
				drawn = true;
				break;
			}
		return drawn;
	}

	/**
	 * Method to determine if a players' number was drawn in 
	 * a particular game when drawing the numbers.
	 * 
	 * If so, return true, else false.
	 * 
	 * @param num the number to check
	 * @param entries the array of numbers the player has in a game
	 * @return true if num matches a number in entries
	 */
	private boolean wasDrawnEntry(int num, int[] entries) {
		boolean drawn = false;
		for(int i = 0; i < entries.length; i++)
			if(entries[i] == num) {
				drawn = true;
				break;
			}
		return drawn;
	}

	/**
	 * Will print a grid of numbers to the console, consisting of 8 rows and 10 columns. 
	 * If a number was drawn, print a "--" to indicate a drawn number, 
	 * else print the number.
	 * 
	 */
	public void printGrid(int[] entries) {
		System.out.println("Numbers drawn: ");
		
		try {
			//draw the 20 numbers. utilize sleep method of Thread class
			//to separate the draw time.
			for(int i = 1; i <= 20; i++) {
				Thread.sleep(1000);

				//check if current drawn number is one of the players numbers
				//if so, print an * to denote a matched numbers
				//otherwise just print the number
				if(wasDrawnEntry(grid[i], entries))
					System.out.print(grid[i] + "* ");
				else
					System.out.print(grid[i] + " ");				
			}
		}catch(Exception e) {
			//possible that Thread is interrupted.
			System.out.println(e);
		}finally {
			System.out.println();

			//print the grid. the position number is determined
			//by 10*r + c-10
			int pos_num = 0;
			for(int r = 1; r <= 8; r++) {
				for(int c = 1; c <= 10; c++) {
					pos_num = (10*r) + (c-10);
					//if number was drawn, print the "--"
					if(wasDrawn(pos_num)) {
						System.out.print("--\t");
					}else {
						//otherwise print the number
						System.out.print(pos_num + "\t");					
					}
				}
				System.out.println();
			} //for
		} //finally
	} //grid
} //class