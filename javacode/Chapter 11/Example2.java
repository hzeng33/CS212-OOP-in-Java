/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Example2{
	public static void main(String args[]){
		Random r = new Random();
		
		//allowing indices 1 to 25
		int arr[] = new int[26];

		for(int i = 0; i < 1000; i++){
		   //random numbers from 1 to 25:
		   arr[r.nextInt(25) + 1] ++;
		}

		for(int i = 1; i <= 25; i++){
		   System.out.println(i + " was generated " + 
		 		  arr[i] + " times.");
		}
	} //main
} //class
