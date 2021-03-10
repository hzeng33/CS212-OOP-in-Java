/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example7{
	public static void main(String args[]){
		int size = 0;
		
            //setup the Scanner for input
		Scanner s = new Scanner(System.in);

            //get the integer from the user
		System.out.println("Please enter the size: ");
		size = s.nextInt();

		for(int r = 1; r <= size; r++){
			  for(int c = 1; c <= size; c++){
				
                        if(c == 1 || c == size 
				|| r == 1 || r == size){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			  }
		System.out.println();
		}
	} //main
} //class
