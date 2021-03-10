/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example6{
	public static void main(String args[]){
	   	   String word = "";
	   	   int num = 0;
	   	   
	   	   //prompt user
	   	   System.out.println("Give me any letter or symbol: ");

	         //setup the Scanner for input   
	   	   Scanner s = new Scanner(System.in);

	   	   //get the symbol from the user
	   	   word = s.next();

	   	   //prompt user
	   	   System.out.println("Enter any number > 0: ");
	   	   num = s.nextInt(); 
	   	
	   	   //while number is negative or 0, enter again
	   	   while (num <= 0) {
		   	   System.out.println("Try again: ");
		       num = s.nextInt(); 
	   	   }
	   	   		
	       //print num number of symbols on the screen
	       while(num > 0){
	           System.out.print(word);
	           num--; //decrease counter
	       }
	} //main
} //class