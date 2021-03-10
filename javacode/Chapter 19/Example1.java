/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example1{
	private static <T> void printElements(T[] arr) {
		for(T val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String args[]){
		Integer arr1[] = {1, 2, 3, 4, 5};
		Double arr2[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		Character arr3[] = {'A', 'B', 'C', 'D', 'E'};
		
		System.out.println("Printing arr1");
		printElements(arr1);
		
		System.out.println("Printing arr2");
		printElements(arr2);
		
		System.out.println("Printing arr3");
		printElements(arr3);
	} //main
} //class
