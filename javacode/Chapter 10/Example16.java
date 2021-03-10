/**
 * Example16.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 10
 * http://www.cstutoringcenter.com
 */
public class Example16{
	private static void swapElements(int arr[], int i, int j) {
	   int temp = arr[i];
	   arr[i] = arr[j];
	   arr[j] = temp;
	}

	private static void printArray(int arr[]) {
	   for (int i = 0; i < arr.length; i++) 
	          System.out.print(arr[i] + " ");
	   System.out.println();
	}

	public static void main(String args[]) {
	   int x[5] = {3,4,5,6,7};

	   printArray(x);
	   swapElements(x, 2, 3);
	   printArray(x);

	} //main
} //class
