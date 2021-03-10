/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 3
 * http://www.cstutoringcenter.com
 */
public class Example2{
	public static void main(String args[]){
        	//convert the command line argument here with the use
         	//of the Integer wrapper class
   	   	int x = Integer.parseInt(args[0]);

   	   	System.out.println("Change for " + x + " cents:");
   	   	int q, d, n, c; //quarters, dimes, nickels and cents wanted

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

