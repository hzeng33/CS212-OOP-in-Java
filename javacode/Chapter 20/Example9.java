/**
 * Example9.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.stream.IntStream;
public class Example9{
	public static void main(String args[]) {
		IntStream st = IntStream.of(5, 7, 2, 33, 10, 2);
		IntStream st2, st3, st4;
		
		//print each value
		st.forEach(System.out::println);

		//create new stream in range
		st2 = IntStream.range(10, 20);
		System.out.println("Count: " + st2.count());

		//create new stream in range
		st3 = IntStream.rangeClosed(10, 25);

		//display its average value as a double
		System.out.println("Avg: " + st3.average().getAsDouble());

		//create new stream in range
		st4 = IntStream.rangeClosed(100, 150);
		int[] arr = st4.toArray();

		//display numbers in range divisible by 5	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 5 == 0) System.out.print(arr[i] + " ");
		}
	} //main
} //class
