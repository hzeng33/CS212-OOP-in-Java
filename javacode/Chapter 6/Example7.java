/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example7{
   public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String entry = "";
		
		//get the entry from the user
		System.out.println("Enter a word or phrase: ");
		entry = s.nextLine();

		//start the counter with the length of the entry
		int counter = entry.length();
		int printer = 0;
		char temp;
		
		while(counter > 0) {
			//if counter is even, print upper case
			//otherwise print lower case
			if(counter % 2 == 0) {
				temp = Character.toUpperCase(
						entry.charAt(counter-1));
			}else {
				temp = Character.toLowerCase(
						entry.charAt(counter-1));
			}
			//reset the printer variable
			printer=0;
			
			//now print the character a certain number of times
			while(printer < counter) {
				System.out.print(temp);	
				printer++;
			}
			
			//decrease the counter variable
			counter--;
			System.out.println();
		}
   } //main
} //class
