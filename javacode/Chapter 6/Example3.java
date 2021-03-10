/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 6
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example3{
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter 4 words separated by a space: ");

		//get the 4 words from the console
		String w1,w2,w3,w4;
		w1 = s.next();
		w2 = s.next();
		w3 = s.next();
		w4 = s.next();

		//declare and obtain different comparison values
		int v1, v2, v3, v4;
		v1 = w1.compareTo(w2);
		v2 = w2.compareTo(w3);
		v3 = w3.compareTo(w4);
		v4 = w4.compareToIgnoreCase(w1);

		//print the 4 values
		System.out.println("V1: " + v1 + " V2: " 
				+ v2 + " V3: " + v3 + " V4: "
				+ v4);

		if(v1 > v2)	w1 = w3;
		if(v3 < v4) w2 = w4;
		if(v2 < v4) w3 = w4;
		if(v4 > v1) w4 = w2;
		
		//print the 4 words
		System.out.println("W1: " + w1 + " W2: " 
				+ w2 + " W3: " + w3 + " W4: " 
				+ w4);
	} //main
} //class
