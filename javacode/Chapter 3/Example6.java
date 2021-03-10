/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 3
 * http://www.cstutoringcenter.com
 */
public class Example6{
	public static void main(String args[]){		
		//the 3 numbers desired
		Double n1, n2, n3, avg;
		
		//convert each argument entered to a double
		//value with the use of the Double wrapper class
		n1 = new Double(args[0]);
		n2 = new Double(args[1]);
		n3 = new Double(args[2]);
		
		//find the average
		avg = (n1.doubleValue() + n2.doubleValue() + 
             n3.doubleValue()) / 3.0;
		
		//display result
		System.out.println("The average is: " + avg);
	} //main
} //class





