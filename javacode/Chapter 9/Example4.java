/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 9
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example4 {
	//recursive method for finding the sum
	private static int sum(int n) {
		if(n <= 1) return 1; //base case
		return n + sum(n-1); //otherwise call again
	}
	
	public static void main(String args[]){
		//Scanner
		Scanner s = new Scanner(System.in);
		int n = 0;
		
		//prompt and get entry
		System.out.println("Enter a number > 1: ");
		n = s.nextInt();
		
		//call method
		System.out.println( sum(n) );
	} //main
} //class
