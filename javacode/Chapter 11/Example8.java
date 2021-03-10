/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example8{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		double n1, n2;
		
		//prompt and get entries
		System.out.println("Enter 2 numbers: ");
		n1 = s.nextDouble();
		n2 = s.nextDouble();
		
		//show the various Math methods
		System.out.println("Absolute 1: " + Math.abs(n1));
		System.out.println("Absolute 2: " + Math.abs(n2));
		
		System.out.println("Ceiling 1: " + Math.ceil(n1));
		System.out.println("Ceiling 2: " + Math.ceil(n2));

		System.out.println("Floor 1: " + Math.floor(n1));
		System.out.println("Floor 2: " + Math.floor(n2));

		System.out.println("Max: " + Math.max(n1, n2));
		System.out.println("Min: " + Math.min(n1, n2));

		System.out.println("Next up 1: " + Math.nextUp(n1));
		System.out.println("Next up 2: " + Math.nextUp(n2));

		System.out.println("Next down 1: " + Math.nextDown(n1));
		System.out.println("Next down 2: " + Math.nextDown(n2));

		System.out.println("n1 ^ n2: " + Math.pow(n1, n2));

		System.out.println("Round n1: " + Math.round(n1));
		System.out.println("Round n2: " + Math.round(n2));

		System.out.println("Square root of n1: " + Math.sqrt(n1));
		System.out.println("Square root of n2: " + Math.sqrt(n2));

		System.out.println("Cube root of n1: " + Math.cbrt(n1));
		System.out.println("Cube root of n2: " + Math.cbrt(n2));
	} //main
} //class
