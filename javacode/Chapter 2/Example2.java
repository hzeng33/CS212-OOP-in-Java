/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 2
 * http://www.cstutoringcenter.com
 */
public class Example2{
	public static void main(String args[]){
   	   int x = 90;

	   //print message to user
   	   System.out.println("Change for " + x + " cents:");

	   //quarters, dimes, nickels and cents wanted
   	   int q, d, n, c; 

   	   q = x / 25;
   	   x = x % 25;
   	   d = x / 10;
   	   x = x % 10;
   	   n = x / 5;
   	   c = x % 5;

   	   System.out.println("Quarters: " + q + "\nDimes: " + d + 
             "\nNickels: " + n + "\nCents: " + c);
	} //main
} //class

