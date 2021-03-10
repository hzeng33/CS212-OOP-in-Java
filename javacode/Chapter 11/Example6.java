/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Example6{
	   public static void main(String args[]){
		   //set a specific seed for the RNG
		   Random r = new Random(1900);
		   
		   //print 10 random numbers
		   for(int i = 0; i < 10; i++)
			   System.out.println(r.nextInt());
	   } //main
} //class
