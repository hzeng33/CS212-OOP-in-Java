/**
 * Example13.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example13{
	private static int minArray(int arr[]) {
	   int min = arr[0];
	   for (int c = 1; c < arr.length; c++)
	      if (arr[c] < min) min = arr[c];
	   return min;
	}

	public static void main(String args[]) {
	   int x[9] = {9,3,4,2,6,7,10,1,2};
	   System.out.println(minArray(x));
	} //main
} //class
