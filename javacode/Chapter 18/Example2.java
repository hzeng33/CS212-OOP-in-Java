/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 18
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		//prompt user for entry
		int size = 0;
		System.out.print("Enter a number between 3 and 10: ");
		size = s.nextInt();

		//out of range so try again
		while(size < 3 || size > 10) {
			System.out.println("Try again: ");
			size = s.nextInt();
		}

		try {
			//print the box of stars
			for(int r = 1; r <= size; r++){
				  for(int c = 1; c <= size; c++){
					//print a star or space every 1/2 second
					Thread.sleep(500);
					if(c == 1 || c == size 
					|| r == 1 || r == size){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
			 	}
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	} //main
} //class
