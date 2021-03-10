/**
 * Example10.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.math.BigInteger;
public class Example10{
	public static void main(String args[]){
		BigInteger b1, b2;
		
		b1 = new BigInteger("15");
		b2 = new BigInteger("100");
		
		//show various methods using the BigInteger's above
		System.out.println("Sum (b1 + b2): " + b1.add(b2));
		System.out.println("Diff (b1 - b2): " + b1.subtract(b2));
		System.out.println("Product (b1 * b2): " 
               + b1.multiply(b2));
		System.out.println("Quotient (b1 / b2): " + b1.divide(b2));
		System.out.println("Mod Division (b1 % b2): " 
                     + b1.mod(b2));
		System.out.println("Max: " + b1.max(b2));
		System.out.println("Min: " + b1.min(b2));
		System.out.println("Negate b1: " + b1.negate());
		System.out.println("Negate b2: " + b2.negate());
		System.out.println("Power (b1 ^ b2): " 
               + b1.pow(b2.intValue()));
	} //main
} //class
