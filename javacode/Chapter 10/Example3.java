/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example3{
        public static void main(String args[]){
            System.out.println("Please enter 10 positive numbers: ");

		//declare array of size 10 and declare Scanner
            int arr[] = new int[10];
            Scanner s = new Scanner(System.in);

		//get the number from the user in the console
            for(int i = 0; i < 10; i++){
                    arr[i] = s.nextInt();
            }

		//loop to count the even and odd numbers entered
            int evens = 0, odds = 0;

            for(int i = 0; i < 10; i++){
                    if(arr[i] % 2 == 0) evens++;
                    else odds++;
            }

		//display result
            System.out.println("There are " + evens
                    + " even numbers and " + odds
                    + " odd numbers.");
        } //main
} //class


