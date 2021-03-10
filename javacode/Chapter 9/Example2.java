/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 9
 * http://www.cstutoringcenter.com
 */
public class Example2{
	public static void Triangle(int x) {
		//base case
   		if (x <= 0) return;
   		
		//recursive call
		Triangle(x - 1);
   
		//print the stars with a loop
   		for (int i = 1; i <= x; i++) 
        		System.out.print("*");
   		
		System.out.println();
	} //Triangle method

	public static void main(String args[]) {
   		Triangle(7);
	} //main
} //class
