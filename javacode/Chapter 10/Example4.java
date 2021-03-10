/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example4{
	public static void main(String args[]){
		//declare array of size 10		
		int arr[10] = new int[10];

		//declare Scanner for input
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter 10 numbers:");

		//get the 10 values from the user
		for(int i = 0; i < 10; i++) 
			arr[i] = s.nextInt();

		int i = 0;
		while(i < 10){		
			//print the specified number of stars
			for(int j = 0; j < arr[i]; j++)
				System.out.print("*");

			System.out.println();
			i++;
		}
	} //main
} //class
