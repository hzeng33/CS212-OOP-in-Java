/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example6{
   public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String entry = "", clean = "";
		
		//get the entry from the user
		System.out.println("Enter a word or phrase: ");
		entry = s.nextLine();

		entry = entry.toUpperCase(); //convert to all the same case

		//get the String, free of any white spaces
		int counter = 0;
		while (counter < entry.length()) {
			//if there is not a white space add to clean String
			if(entry.charAt(counter) != ' ') {
				clean += entry.charAt(counter);
			}
			counter++;
		}

		//start counter with the length of the cleaned String
		counter = clean.length();
		int left = 0, right = counter-1;

		//find the midpoint where the movement should stop
		int midpoint = counter/2;
		boolean isPal = true;
		
		//so long as we are less than the midpoint
		while(left < midpoint) {
			//two characters match. One at the left
			//and one at the right so continue
			if(clean.charAt(left) == clean.charAt(right)) {
				//move left and right indices
				left ++;
				right --;
			}else {
				//mismatched characters so palindrome is false
				isPal = false;
				break; //no need to continue
			}			
		}//while

		//check for the palindrome
		if(isPal) {
           System.out.println("You entered a palindrome!")	
		}else {
		     System.out.println("You didn't enter a palindrome!");
		}
   } //main
} //class
