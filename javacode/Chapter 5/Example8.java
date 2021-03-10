/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example8{
	public static void main(String args[]){
		//Scanner and variables
		Scanner s = new Scanner(System.in);
		short entry = 0, magic_number = 7;
		
		do {
			System.out.println("Enter a number from 1 to 10: ");
			entry = s.nextShort();
		}while(entry != magic_number);

		System.out.println("You guessed it!");
	} //main
} //class
