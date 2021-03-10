/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example3{
	public static void main(String args[]){
		//Scanner variable
		Scanner s = new Scanner(System.in);
		
		//int variables
		int sum = 1, entry = 0;
		
		//get entry from the user
		System.out.print("Please enter a number >= 1: ");
		entry = s.nextInt();
		
		//while the user didn't follow directions
		while (entry < 1) {
			System.out.println("Try again: ");
			entry = s.nextInt();
		}
		
		//have correct entry so find the sum
		for(int i = 1; i <= entry; i++) {
			if(i % 5 == 0) 
                  System.out.print(i + " ");
		}		
	} //main
} //class
