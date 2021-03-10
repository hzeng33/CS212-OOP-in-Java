/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example2{
   public static void main(String args[]){
		//needed variables
		Scanner s = new Scanner(System.in);
		String keyword = "Balloon", entry = "";
		
		//prompt user
		System.out.println("Enter a word: ");
		
		//get the character from the user
   		entry = s.nextLine();

   		//give user 3 chances to enter the keyword
   		int chances = 1;
   		while (chances < 3) {
   			if(entry.equals(keyword)) {

   			   //found the word exactly as typed
   			   //print message and exit program
   			   System.out.println("You found it exactly!");
   			   System.exit(1);

   			}else if (entry.equalsIgnoreCase(keyword)) {

   			   //found it but not exactly as case is ignored
   			   //print message and exit
   			   System.out.println("Found it! Case was ignored!");
   			   System.exit(1);

   			}else {  
			   //max attempts reached
			   if(chances == 3)
				break;

   			   //no match so try again
   			   System.out.println("Try again. " + (3-chances) 
                  + " chances left: ");

   			   //get String from user
   			   entry = s.nextLine();
   				
  			   //no match. Try again
   			   chances ++;
   			}
   		}

   		//no successful entries if you arrived here
   		System.out.println("You have failed after 3 attempts");

   } //main
} //class
