/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 3
 * http://www.cstutoringcenter.com
 */
public class Example1{
	public static void main(String args[]){
   		int a = 0, b = 0;

	         //convert (parse) the entered Strings to an int value
        	 //with the use of the Integer wrapper class
	   	a = Integer.parseInt(args[0]);
	   	b = Integer.parseInt(args[1]);

	         //addition
        	 System.out.println("The sum is: " + (a+b));

	         //subtraction
        	 System.out.println("The difference is: " + (a-b));

	         //multiplication
        	 System.out.println("The product is: " + (a*b));

	         //division
        	 System.out.println("The quotient is: " + (a/b));

	         //modular division
        	 System.out.println("The a mod b is: " + (a%b));
     } //main
} //class
