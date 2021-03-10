/**
 * Example12.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example12{
	public static void main(String args[]){
		int s[] = new int[5];

		for(int i = 0; i < 5; i++)
			s[i] = i*3;

		int sum = sumArray(s);

            System.out.println("sumArray: " + sum);
	} //main

	private static int sumArray(int arr[]){
		int sum = 0;

		for(int i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	} //sumArray
} //class
