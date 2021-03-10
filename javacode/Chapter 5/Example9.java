/**
 * Example9.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 5
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example9{
	public static void main(String args[]){
		int num = 0;
		System.out.println("Give me any number: ");

               //setup Scanner for input   
		Scanner s = new Scanner(System.in);

               //get number from the user
		num = s.nextInt(); 
	
               //determine the value
		switch(num % 2){
      		case 0:
			System.out.println("It's even!");
			break;
    
      		case 1:
			System.out.println("It's odd!");
			break;
   		}
	} //main
} //class
