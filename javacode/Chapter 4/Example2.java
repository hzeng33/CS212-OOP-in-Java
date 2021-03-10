/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 4
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example2{
	public static void main(String args[]){
		//setup the Scanner
		Scanner s = new Scanner(System.in);

		//variables needed
		double n1, n2, n3, avg;
		
		//prompt user for the input
		System.out.println("Enter 3 numbers: ");
		n1 = s.nextDouble();
		n2 = s.nextDouble();
		n3 = s.nextDouble();
		
		//find average
		avg = (n1 + n2 + n3) / 3.0;
		
		//display result
		System.out.println("The average is: " + avg);
	} //main
} //class






