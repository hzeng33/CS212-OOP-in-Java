/**
 * Example11.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example11{	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
	      System.out.println("Enter a number between 1 & 7: ");
      int val = s.nextInt();
	
		while(val < 1 || val > 7){
			System.out.println("Try again: ");
      	val = s.nextInt();
      }

		for(DayOfTheWeek day : DayOfTheWeek.values()){
			if(day.getValue() == val){
            	System.out.println("You chose " + day);
			System.out.println("It is preceeded by " 
                         + day.previous());
			System.out.println("It is followed by " 
                         + day.next());
             break;
                   }
      }
	} //main
} //class
