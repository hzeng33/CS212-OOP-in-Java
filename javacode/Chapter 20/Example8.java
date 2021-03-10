/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.Arrays;
public class Example8{
	private static void print(short arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String args[]) {
		short arr1[] = new short[10];
		short arr2[] = {50, 90, 70, 100, 30};

		//fill arr1 with data		
		for(short i = 0; i < 10; i++)
			arr1[i] = (short)((10-i)*i);
		
		//print arrays
		print(arr1);
		print(arr2);
		
		//sort arrays
		Arrays.sort(arr1);
		Arrays.parallelSort(arr2);

		//print arrays		
		print(arr1);
		print(arr2);
		
		//print results of the binary search
	System.out.println(Arrays.binarySearch(arr1, 0, 6, (short)21));
	System.out.println(Arrays.binarySearch(arr2, 1, 3, (short)40));

		//fill arrays
		Arrays.fill(arr1, (short)10);
		Arrays.fill(arr2, 0, 2, (short)5);

		//modify data
		arr2[0] = 101;
		arr1[1] = 11;
		arr1[6] = 2;

		//sort arrays again in certain range
		Arrays.sort(arr1, 0, 3);
		Arrays.sort(arr2, 0, 3);

		//print arrays
		print(arr1);
		print(arr2);
	} //main
} //class
