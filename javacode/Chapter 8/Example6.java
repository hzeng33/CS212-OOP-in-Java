/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 8
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example6{
	private static int countNines(int n){
		int count = 0;
		while(n > 0){
			//found a 9 so increment count variable
			if(n % 10 == 9) count++;
			n = n/10; //truncate the number
		}

		//return calculated value
		return count;
	}

	public static void main(String args[]){
		int n = 0;

		//get the integer from the user
		System.out.print("Please enter a positive integer: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		//not positive so keep trying
		while(n < 0){
			System.out.print("\nNot positive, try again: ");
			n = nextInt();
		}

		//call method and display result
		System.out.println("\nThere are " + countNines(n) 
		 	+ " nines in the number");
	} //main
} //class
