/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example3{
	private static <T extends Comparable<T>> T max(T[] arr) {
		//start at first element
		T max_value = arr[0];
		
		for(T curr : arr) {
			//first comparison will return 0
			if(curr.compareTo(max_value) > 0)
				max_value = curr;
		}
		return max_value;
	}
	private static <T extends Comparable<T>> T min(T[] arr) {
		//start at first element
		T min_value = arr[0];
		
		for(T curr : arr) {
			//first comparison will return 0
			if(curr.compareTo(min_value) < 0)
				min_value = curr;
		}
		return min_value;
	}

	public static void main(String args[]){
		Short arr[] = {5, 12, 4, 5, 2, 7};
		Integer arr2[] = {15, 12, 24, 5, 12, 37};
		Double arr3[] = {5.5, 12.2, 1.7, 12.4, 12.3, 12.1};
		String arr4[] = {"Frank","Ralph","Lisa","Charles","James"};
		
		System.out.println( max(arr) );
		System.out.println( max(arr2) );
		System.out.println( max(arr3) );
		System.out.println( max(arr4) );

		System.out.println( max(arr) );
		System.out.println( min(arr2) );
		System.out.println( min(arr3) );
		System.out.println( min(arr4) );
	} //main
} //class
