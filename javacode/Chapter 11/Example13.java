/**
 * Example13.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.math.BigInteger;
public class Example13{
	public static BigInteger fib(long n) {
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("1");
		BigInteger sum;
		
		for(long i = 3; i <= n; i++) {
            //String representation
			sum = new BigInteger( (n1.add(n2)).toString() );			
			n1 = n2; //old n2
			n2 = sum; //new number is sum
		}
		return n2; //returns Nth Fibonacci number
	}
	
	public static long fibOld( long n ){
		long n1 = 1, n2 = 1;

		for(int i = 3; i <= n; i++){
			long c = n1 + n2;  //sum of previous 2
			n1 = n2;  //old n2
			n2 = c;  //new number is the sum
		}
		return n2; //returns Nth Fibonacci number
	}
	
	public static void main(String args[]) {
		//print 10th Fibonacci number using BigInteger method
		System.out.println("BigInt fib(10): " + fib(10));

		//print 10th Fibonacci number using long method
		System.out.println("Long fib(10): " + fibOld(10));

		//print 92nd Fibonacci number using BigInteger method
		System.out.println("BigInt fib(92): " + fib(92));

		//print 92nd Fibonacci number using long method
		System.out.println("Long fib(92): " + fibOld(92));

		//print 93rd Fibonacci number using BigInteger method
		System.out.println("BigInt fib(93): " + fib(93));

		//print 93rd Fibonacci number using long method
		System.out.println("Long fib(93): " + fibOld(93));
	} //main
} //class
