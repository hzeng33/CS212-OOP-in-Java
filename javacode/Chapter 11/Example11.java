/**
 * Example11.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.math.BigInteger;
public class Example11{
	public static void main(String args[]) {
		BigInteger b1, b2, b3;
		
		b1 = new BigInteger("37"); //known prime
		b2 = new BigInteger("99"); //not prime

		//print results by checking if numbers are likely primes
		System.out.println("B1 is prime? " 
                      + b1.isProbablePrime(1));
		System.out.println("B2 is prime? " 
                      + b2.isProbablePrime(10));
		
		//perform some math and create a new BigInteger
		b3 = new BigInteger( b1.add(b2).toString() );

		//show the results of the addition
		System.out.println("B3 = " + b3);		
		//use method with more certainty
		System.out.println("B3 is prime? " 
                      + b3.isProbablePrime(100));

		//find the next likely prime after the value of b3
		System.out.println("Likely next prime is: " 
                      + b3.nextProbablePrime());
	} //main
} //class		
