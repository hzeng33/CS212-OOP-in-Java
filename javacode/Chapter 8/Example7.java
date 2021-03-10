/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 8
 * http://www.cstutoringcenter.com
 */
import java.util.Scanner;
public class Example7{
	public static void main(String args[]) {
		//Scanner
		Scanner s = new Scanner(System.in);
		int size = 0;
		
		System.out.println("Enter an integer > 0: ");
		size = s.nextInt();
		
		if(size < 1) System.exit(1);
		
		//call the method for printing
		printTriangle(size);
		
		System.out.println();

		//call the method for printing		
		printSquare(size);
	} //main

	//method for printing a triangle of stars
	private static void printTriangle(int size) {
        	//loop through to print the triangle
		for(int r = 1; r <= size; r++) {
		  	for(int c = 1; c <= r; c++) {
		     		System.out.print("*");
		  	}
		  	System.out.println();
		}
	} //printTriangle()

	//method for printing a box of stars	
	private static void printSquare(int size) {
        	//loop through to print the square
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
	} //printSquare()
} //class
