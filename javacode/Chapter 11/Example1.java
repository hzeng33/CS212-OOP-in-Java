/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
import java.util.Random;
public class Example1{
	public static void main(String args[]){
		Random r = new Random();
		int arr[] = new int[20];

		for(int i = 0; i < 20; i++){
		   //random numbers from 1 to 10:
		   arr[i] = r.nextInt(10) + 1;
		}

		for(int i = 0; i < 20; i++){
		   System.out.print(arr[i] + " ");
		}
	} //main
} //class
