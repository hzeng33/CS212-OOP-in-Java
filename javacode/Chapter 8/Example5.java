/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 8
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example5{
	private static int sumOfNumbers(int x){
		int sum = 0;

		//find sum by looping
		for(int i = 1; i <= x; i++)
			sum += i;

		//return the calculated value
		return sum;
	}

	public static void main(String args[]){
		int n = 0;

		System.out.println("Please enter a number for the sum:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		System.out.println("The sum is: " + sumOfNumbers(n));
	} //main
} //class
