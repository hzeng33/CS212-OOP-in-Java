/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 3
 * http://www.cstutoringcenter.com
 */
public class Example4{
	public static void main(String args[]){		
		//the 3 numbers desired
		Double n1 = new Double("4.59234");
		Integer n2 = 5;

		//display results for n1
		System.out.println("current value: " + n1);
		System.out.println("short value: " + n1.shortValue());
		System.out.println("int value: " + n1.intValue());
		System.out.println("long value: " + n1.longValue());
		System.out.println("float value: " + n1.floatValue());
		System.out.println("double value: " + n1.doubleValue());

		System.out.println();

		//display results for n2
		System.out.println("current value: " + n2);
		System.out.println("short value: " + n2.shortValue());
		System.out.println("int value: " + n2.intValue());
		System.out.println("long value: " + n2.longValue());
		System.out.println("float value: " + n2.floatValue());
		System.out.println("double value: " + n2.doubleValue());
	} //main
} //class



