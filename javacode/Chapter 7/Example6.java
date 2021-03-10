/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example6{
	public static void main(String args[]){
		int size = 0;

            //setup the Scanner for input		
		Scanner s = new Scanner(System.in);

            //get integer from the user
		System.out.println("Please enter the size: ");
		size = s.nextInt();

		if(size <= 0 || size > 10) 
			System.exit(1);

            //loop through the program to print the triangle
		for(int r = 1; r <= size; r++) {
		  	for(int c = 1; c <= r; c++) {
		     		System.out.print("*");
		  	}
		  	System.out.println();
		}
	} //main
} //class
