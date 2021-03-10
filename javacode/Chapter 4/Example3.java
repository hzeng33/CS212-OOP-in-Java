/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 4
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example3{
	public static void main(String args[]){
		//setup the Scanner
		Scanner s = new Scanner(System.in);

		//variables needed for input
		long n1, n2;
		
		//prompt user for the input
		System.out.println("Enter 2 numbers: ");
		n1 = s.nextLong();
		n2 = s.nextLong();

		//variables for the various needs
		double avg = 0.0;
		long sum, diff, prod, quot, mod;

		//initialize all variables to 0
		sum = diff = prod = quot = mod = 0;
		
		//find average
		avg = (n1 + n2) / 2.0;

		//find sum
		sum = n1+n2;
		diff = n1-n2;
		prod = n1*n2;
		quot = n1/n2;
		mod = n1 % n2;
		
		//display results
		System.out.println("The average is: " + avg);
		System.out.println("The sum is: " + sum);
		System.out.println("The difference is: " + diff);
		System.out.println("The product is: " + prod);
		System.out.println("The quotient is: " + quot);
		System.out.println("The remainder is: " + mod);
	} //main
} //class





