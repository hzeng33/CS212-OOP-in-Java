/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example3{
	public static void main(String args[]){
		//setup the Scanner
		Scanner s = new Scanner(System.in);

		//prompt user
		System.out.println("Enter 3 numbers, whole or decimal: ");
		
		//needed variables
		double a, b, c;
		
		//get values
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();

		//a series of decisions
		if (a > b) {
			if(a > c) {
				System.out.println("Apples");
			}else {
				System.out.println("Oranges");
			}
		}else if(b > a) {
			if(b > c) {
				System.out.println("Tomato");
			}else {
				System.out.println("Potato");
			}
		}
		
	} //main
} //class