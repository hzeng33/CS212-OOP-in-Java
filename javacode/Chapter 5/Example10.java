/**
 * Example10.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example10{
	public static void main(String args[]){
		String ch;
   		System.out.println("Enter a letter in the alphabet: ");
   
               //setup the Scanner for input
		Scanner s = new Scanner(System.in);
               
		//get the character from the user
   		ch = s.next();

               //determine its type
   		switch(ch){
        	case "A":
      		case "a":
		case "E":
		case "e":
		case "I":
		case "i":
		case "O":
		case "o":
		case "U":
		case "u":
			System.out.println("It's a vowel");
			break;
     		default:
			System.out.println("It's a consonant.");
			break;   
	   	}
	} //main
} //class
