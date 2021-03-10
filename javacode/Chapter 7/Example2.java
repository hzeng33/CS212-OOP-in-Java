/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example2{
	public static void main(String args[]){
		//Scanner variable
		Scanner s = new Scanner(System.in);
		
		//int variables
		int sum = 1, entry = 0;
		
		//get entry from the user
		System.out.print("Please enter a number > 1: ");
		entry = s.nextInt();
		
		//while the user didn't follow directions
		while (entry <= 1) {
			System.out.print("Try again: ");
			entry = s.nextInt();
		}
		
		//have correct entry so find the sum
		for(int i = 2; i <= entry; i++) {
			sum += i;
		}
		
		//output sum
		System.out.println("The sum from 1 to " + entry + 
				" is: " + sum);
	} //main
} //class
