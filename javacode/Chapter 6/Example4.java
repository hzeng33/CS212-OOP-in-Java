/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example4{
   public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String entry = "", reverse = "";
		
		//get the entry from the user
		System.out.println("Enter a word or phrase: ");
		entry = s.nextLine();

		//start the counter with the length of the entry
		int counter = entry.length();
		
		//build the reverse of the String
		while(counter > 0) {
			reverse += entry.charAt(counter-1);
			counter--;
		}

		//print the reverse
		System.out.println("The reverse of the entry is: " 
				+ reverse);
   } //main
} //class
