/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 4
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example4{
	public static void main(String args[]){
		//setup the Scanner
		Scanner s = new Scanner(System.in);

		//prompt user
		System.out.println("Enter a sentence: ");
		
		//declare variables for the first two words
		String word1 = "", word2 = "";

		word1 = s.next(); //get first word
		word2 = s.next(); //get second word
		
		//get the rest of the sentence entered
		String sentence = "";
		sentence = s.nextLine();
		
		//display output
		System.out.println("Word 1: " + word1);
		System.out.println("Word 2: " + word2);
		System.out.println("Sentence: " + sentence);
	} //main
} //class
