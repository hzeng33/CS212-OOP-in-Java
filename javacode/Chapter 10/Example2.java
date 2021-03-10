/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example2{
   public static void main(String args[]){
		//String variable
		Scanner s = new Scanner(System.in);
		
		//variables needed
		double entries[] = new double[5];
		double sum = 0.0;
		int count = 0;
		
		//get the 5 numbers from the user
		while (count < 5) {									
			System.out.println("Please enter a decimal: ");
			entries[count] = s.nextDouble();
			count++;
		}
		
		//find the sum of the numbers
		for(int i = 0; i < 5; i++)
			sum += entries[i];

		System.out.println("The sum is: " + sum);
   }//main
} //class
