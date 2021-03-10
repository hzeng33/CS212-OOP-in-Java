/**
 * Example10.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example10{
	   public static void main(String args[]){
			System.out.println("Please enter 10 numbers:");

			//declare array of size 10		
			int arr[] = new int[10];

			//declare Scanner for input
			Scanner s = new Scanner(System.in);

			//get the 10 values from the user
			for(int i = 0; i < 10; i++) 
				arr[i] = s.nextInt();

			//go through each element of the array
			for(int j : arr) {
				//j will be the value from the array
				//if 0 or negative, no stars print
				for(int k = 0; k < j; k++)
					System.out.print("*");
				System.out.println();
			}
	   } //main
} //class
