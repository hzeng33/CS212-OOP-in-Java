/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Example4{
	public static void main(String args[]) {
		Random d1, d2;

		//initialize new Random objects representing
		//two dice
		d1 = new Random();
		d2 = new Random();

		//array to track the doubles, allows for using index 1 to 6
		int pairs[] = new int[7];
		int d1_roll = 0, d2_roll = 0;

		//roll the pair 1000 times		
		for(int i = 0; i < 1000; i++) {
			//roll the pair of dice (numbers 1 to 6)
			d1_roll = d1.nextInt(6) + 1;
			d2_roll = d2.nextInt(6) + 1;
			
			//same number was rolled
			if(d1_roll == d2_roll)
				pairs[d1_roll] ++;
		}

		//print the results to the user
		for(int i = 1; i <= 6; i++)
			System.out.println("Pairs of " + i + "s were rolled " 
					+ pairs[i] + " times.");
	} //main
} //class
