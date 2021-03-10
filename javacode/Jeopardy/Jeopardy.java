/**
 * Jeopardy.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Appendix E
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Jeopardy{
	private int board[][], sumRd1, sumRd2, row, col;

	//constructor	
	public Jeopardy() {
		board = new int[5][6];
		row = col = 0;
		sumRd1 = sumRd2 = 0;
	}

	//get methods	
	int getSumRd1() { return sumRd1; }
	int getSumRd2() { return sumRd2; }
	
	//set methods
	void setSumRd1(int s) { sumRd1 = s; }
	void setSumRd2(int s) { sumRd2 = s; }

	//method to be used for simulating the gameplay round
	//either single (round 1) or double (round 2) Jeopardy
	void questions(int round) {
		Random r = new Random();
		
		//thirty questions in the round
		for(int q = 1; q <= 30; q++) {
			//randomly move to a row and column
			row = r.nextInt(5);
			col = r.nextInt(6);
			
			//an empty space as the question has already been
			//answered
			while(board[row][col] == 0) {
				row = r.nextInt(5);
				col = r.nextInt(6);
			}
			
			//DD found
			if(board[row][col] == 2) {				
				//If DD selected first, the player has 
                		//no money, add $5 or $1,000 (randomly picked): 
				if(sumRd1 == 0){
				
				//randomly choosing amount 
                  //(0 = $5 & 1 = $1,000) 
				int amt = r.nextInt(2);
				
				if(amt == 0) //$5 chosen
					sumRd1 += 5;
				else //$1,000 chosen
					sumRd1 += 1000;
				
				}else{
			
					//Assuming player answers right & doubles 
					//the money:
					if(round == 1) sumRd1 *= 2;
					if(round == 2) sumRd2 *= 2;
			
				}

			}else{
		
				//Current value of the questions:
				if(round == 1) sumRd1 += (200 * (row+1));
				if(round == 2) sumRd2 += (400 * (row+1));
		
			}

			//Empty space in array to show question was asked.
			board[row][col] = 0;
		}		
	} //questions

	//method to randomly place the Daily Doubles on the game board
	void dailyDoubles(int round) {
		Random r = new Random();
		int ddcol1 = -1;
		for(int i = 0; i < round; i++) {
			int ddrow = r.nextInt(2);
			int ddcol = r.nextInt(6);

			//second round cannot have a DD in
			//the same column so assign location
			//for first DD to variable
			if(i == 0 && round == 2) ddcol1 = ddcol;
			
			//indicating row 5 (bottom)
			if(ddrow == 1) ddrow = 4;

			//the DD has been found in that spot or the
			//column generated is the same as the first DD
			//so keep generating until its fine
			while(board[ddrow][ddcol] == 2 
                    || (round == 2 && i ==1 && ddcol == ddcol1)){
				ddrow = r.nextInt(2);
				ddcol = r.nextInt(6);

				if(ddrow == 1) ddrow = 4;			
			} //while

			//place the DD on the game board
			board[ddrow][ddcol] = 2;
		}
	} //dailyDoubles

	//method to reset the game board to all 1s before round 2
	void clear() {
		//reset the game board to all 1s
		for(int r = 0; r < 5; r++)
			for(int c = 0; c < 6; c++)
				board[r][c] = 1;
	} //clear
} //class
