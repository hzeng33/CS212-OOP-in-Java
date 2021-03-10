/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example2{
	private static <T extends Comparable<T>> T max(T a, T b, T c) {
		//start at first element
		T max_value = a;
		
		//if next element comes after current max_value
		//then new max_value is b
		if(b.compareTo(max_value) > 0)
			max_value = b;

		//if next element comes after current max_value
		//then new max_value is c
		if(c.compareTo(max_value) > 0)
			max_value = c;

		return max_value;
	}
	private static <T extends Comparable<T>> T min(T a, T b, T c) {
		//start at first element
		T min_value = a;

		//if next element comes before current min_value
		//then new min_value is b
		if(b.compareTo(min_value) < 0)
			min_value = b;

		//if next element comes before current min_value
		//then new min_value is c
		if(c.compareTo(min_value) < 0)
			min_value = c;

		return min_value;
	}	
	public static void main(String args[]){
		Integer a = 5, b = 3, c = 7;
		Double i = 4.44, j = 4.32, k = 4.44;
		Character x = 'C', y = 'R', z = 'K';
		
		System.out.println( max(a, b, c) );
		System.out.println( max(i, j, k) );
		System.out.println( max(x, y, z) );
		
		System.out.println( min(a, b, c) );
		System.out.println( min(i, j, k) );
		System.out.println( min(x, y, z) );
	} //main
} //class
