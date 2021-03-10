/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example4{
	public static void main(String args[]){
		//Scanner variable
		Scanner s = new Scanner(System.in);
		
		//double precision variables
		double avg = 0.0, entry = 0.0;

		//get entry from the user
		System.out.print("Please enter a number > 1: ");
		entry = s.nextDouble();
		
		//while the user didn't follow directions
		while (entry <= 1.0) {
			System.out.print("Try again: ");
			entry = s.nextDouble();
		}
		
		//find the sum of the numbers first
		for (double i = 1.0; i <= entry; i += 1.0) {
			avg += i;
		}
		
		//final value calculated here
		avg = avg / entry;
		
		//output average
		System.out.println("The average from 1.0 to " + entry + 
				" is: " + avg);	
	} //main
} //class
