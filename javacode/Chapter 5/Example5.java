/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example5{
	public static void main(String args[]){
   	   int num;
   	   System.out.println("Give me any positive even number: ");

           //setup the Scanner for input   
   	   Scanner s = new Scanner(System.in);

           //get the number from the user
           num = s.nextInt(); 
	
          //as long as the number is odd, keep asking for another
          while(num % 2 == 1 || num <= 0){
              System.out.println("Not even, try again: ");
              num = s.nextInt();
          }

          //display result
          System.out.println("Right! You entered: " + num);
	} //main
} //class
