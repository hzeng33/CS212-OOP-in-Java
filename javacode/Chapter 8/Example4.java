/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 8
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example4{
	private static void multiPrint(String c, int x){
		//print the character x times
		for(int i = 0; i < x; i++) 
      		System.out.print(c);
		System.out.println();
	}

	public static void main(String args[]){
		int n = 0;
		String c = "";

		System.out.println("Please enter a number and character:");
	
            //Scanner for input of both the integer and character	
      Scanner s = new Scanner(System.in);
		n = s.nextInt();
      c = s.next();

            //call method to print that character
		multiPrint(c, n);
	} //main
} //class
