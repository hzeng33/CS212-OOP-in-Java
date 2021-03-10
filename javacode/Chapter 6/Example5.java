/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example5{
   public static void main(String args[]){
		//String variable
		Scanner s = new Scanner(System.in);
		String entry = "";
		
		//get the entry from the user
		System.out.println("Enter a word or phrase: ");
		entry = s.nextLine();

		//start the counter with the length of the entry
		int counter = entry.length();
		int left = 0, right = counter-1;

		//find the midpoint where the movement should stop
		int midpoint = counter/2;
		boolean isPal = true;
		
		//so long as we are less than the midpoint
		while(left < midpoint) {
			//two characters match. One at the left
			//and one at the right so continue
			if(entry.charAt(left) == entry.charAt(right)) {
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
			System.out.println("You entered a palindrome!");			
		}else {
			System.out.println("You didn't enter a palindrome!");		}
   } //main
} //class
