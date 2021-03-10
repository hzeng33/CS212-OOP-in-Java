/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 8
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example8{
	public static void main(String args[]) {
		//Scanner
		Scanner s = new Scanner(System.in);
		int n1, n2, n3;
		
		//initialize variables
		n1 = n2 = n3 = 0;
		
		//prompt user and obtain entries
		System.out.println("Enter 3 integers: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();

		//print out the values of the method returns
		System.out.println( sum(n1, n2) );
		System.out.println( diff(n1, n2) );
		System.out.println( prod(n1, n2) );
		System.out.println( sum(n1, n2, n3) );
		System.out.println( diff(n1, n2, n3) );
		System.out.println( quot(n1, n2) );
		System.out.println( quot(n2, n3) );

		//call the mystery methods
		System.out.println( mystery(n2, n3) );
		System.out.println( mystery(n1, n2, n3) );
	} //main
	
	//method to return the sum of two int variables
	private static int sum(int a, int b) {
		return a + b;
	}

	//method to return the sum of three int variables
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	//method to return the difference of two int variables
	private static int diff(int a, int b) {
		return a - b;
	}

	//method to return the difference of three int variables
	private static int diff(int a, int b, int c) {
		return a - b - c;
	}

	//method to return the product of two int variables
	private static int prod(int a, int b) {
		return a * b;
	}

	//method to return the product of three int variables
	private static int prod(int a, int b, int c) {
		return a * b * c;
	}

	//method to return the quotient of two int variables
	private static int quot(int a, int b) {
		if(b == 0) return -1;
		return a / b;
	}

	//mystery method 1
	private static int mystery(int a, int b) {
		if(a < b) {
			return sum(a, b) + prod(a, b);
		}else {
			return diff(a, b) + prod(a, b);
		}
	}

	//mystery method 2
	private static int mystery(int a, int b, int c) {
		if(a < c) {
			return sum(a, b) + prod(b, c);
		}else {
			return diff(c, b) + prod(a, b);
		}
	}
} //class

