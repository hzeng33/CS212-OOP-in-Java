/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example7{
	public static void main(String args[]){
	   int n = 0, strikes = 0;
   	   System.out.println("Please enter a positive integer: ");

           //setup the Scanner for input   
	   Scanner s = new Scanner(System.in);

           //get the integer from the user
	   n = s.nextInt();

          //number is odd or negative
          while(n%2 == 1 || n < 0){
		//increase strike count
               	strikes++;

               if(strikes == 3){
			System.out.println("You Failed");
			System.exit(1);
		}

               //get another value from the user
               	System.out.println("Not even or positive. Try again: ");
               	n = s.nextInt();
          }

          System.out.println("Thank you. You entered " + n);

        } //main
} //class
