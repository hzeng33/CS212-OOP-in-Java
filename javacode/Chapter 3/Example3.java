/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 3
 * http://www.cstutoringcenter.com
 */
public class Example3{
	public static void main(String args[]){		
		//the 3 numbers desired
		double n1, n2, n3, avg;
		
		//convert each argument entered to a double
		//value with the use of the Double wrapper class
		n1 = Double.parseDouble(args[0]);
		n2 = Double.parseDouble(args[1]);
		n3 = Double.parseDouble(args[2]);
		
		//find the average & display result
		avg = (n1 + n2 + n3) / 3.0;
		
		System.out.println("The average is: " + avg);
	} //main
} //class


