/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 7
 * http://www.cstutoringcenter.com
 */
public class Example8{
	public static void main(String args[]){
		int r = 0, c = 0, s = 0;

      //pyramid of stars:
		for(r=1; r<=5; r++){
		   System.out.println();

		   for(s=1; s <= 5-r; s++) 
               System.out.print(" ");

		   for(c=1; c <= 2*r-1; c++) 
               System.out.print("*");
		}

	} //main
} //class

