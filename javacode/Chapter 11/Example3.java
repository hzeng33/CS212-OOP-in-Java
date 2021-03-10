/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Example3{
	public static void main(String args[]){
		Random r = new Random();
		int num = 0;

	      for(int i = 0; i < 25; i++){
	         //random numbers from 0 to 15:
	         num = r.nextInt(16);
	         for(int j = 0; j < num; j++) 
	    	      System.out.print("*");
	         System.out.println();
	      }
	} //main
} //class
