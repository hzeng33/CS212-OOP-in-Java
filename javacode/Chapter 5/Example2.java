/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example2{
	public static void main(String args[]){
		//setup the Scanner
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number between 10 and 20: ");
		
		//needed variables
		int num = 0, strikes = 0;
		
		//get next number from user
		num = s.nextInt();
		
		//first check
		if(num < 10 || num > 20) {
			//bad number so increase strike count
			strikes ++;						
		}else { //assumes correct number
			System.out.println("Thank you! You entered " + num);
			System.exit(1); //terminate
		}

		//otherwise prompt again and get number
		System.out.println("Strike 1. Try again: ");
		num = s.nextInt();

		//second check
		if(num < 10 || num > 20) {
			//bad number so increase strike count
			strikes ++;			
		}else { //assumes correct number
			System.out.println("Thank you! You entered " + num);
			System.exit(1); //terminate
		}
		
		//otherwise prompt again and get number
		System.out.println("Strike 2. Last chance: ");
		num = s.nextInt();

		//last check
		if(num < 10 || num > 20) {
			//bad number so increase strike count
			strikes ++;			
		}else { //assumes correct number
			System.out.println("Thank you! You entered " + num);
			System.exit(1); //terminate
		}

		//strike limit reached so exit
		if(strikes == 3) {
			System.out.println("You can't follow directions");
			System.exit(1);
		}	 	
	} //main
} //class
