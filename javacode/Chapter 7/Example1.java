/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example1{
	public static void main(String args[]){

		int times = 0;

            //setup the Scanner for input		
		Scanner s = new Scanner(System.in);

            //get integer from user
		System.out.println("How many times? ");
		times = s.nextInt();

		if(times < 0 || times >= 20) 
			System.exit(1);

            //print out the numbers from 1 to times
		for(int i = 1; i <= times; i++) {
		      System.out.println(i);
		}

	} //main
} //class
