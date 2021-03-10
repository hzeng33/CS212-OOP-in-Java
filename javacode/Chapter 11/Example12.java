/**
 * Example12.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.math.BigInteger;
public class Example12{
	public static BigInteger factorial(long n) {
		BigInteger ans = new BigInteger("1");
		String num = "";
		
		for(long i = n; i > 1; i--) {
			num = i + "";
			ans = ans.multiply(new BigInteger(num));
		}
		return ans;
	}
	
	public static long factorialOld(long n){
		long ans = 1;

		for(long i = n; i > 1; i--) 
			ans *= i;

		return ans;
	}
	
	public static void main(String args[]) {
		//print the BigInteger factorial of 20
		System.out.println("BigInt fact(20): " + factorial(20));

		//try to print the long factorial of 20
		System.out.println("Long fact(20): " + factorialOld(20));

		//print the BigInteger factorial of 20
		System.out.println("BigInt fact(50): " + factorial(50));

		//try to print the long factorial of 20
		System.out.println("Long fact(50): " + factorialOld(50));

		//print the BigInteger factorial of 20
		System.out.println("BigInt fact(100): " + factorial(100));

		//try to print the long factorial of 20
		System.out.println("Long fact(100): " + factorialOld(100));
	} //main
} //class
