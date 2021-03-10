/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 18
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example1{	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		//prompt user for entry
		int entry = 0;
		System.out.print("Enter a number between 5 and 30: ");
		entry = s.nextInt();

		//entry is invalid so keep trying		
		while(entry < 5 || entry > 30) {
			System.out.println("Try again: ");
			entry = s.nextInt();
		}

		try {
			System.out.println("Program ends in ");

			//loop trough to print a number every 1 second
			for(int i = entry; i >= 1; i--) {
				System.out.print(i + "...");
				Thread.sleep(1000);
			}			
		}catch(Exception e) {
			System.out.println(e);
		}
	} //main
} //class
