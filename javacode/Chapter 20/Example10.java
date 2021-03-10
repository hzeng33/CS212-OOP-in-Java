/**
 * Example10.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.stream.LongStream;
public class Example10{
	public static void main(String args[]) {
		LongStream st = LongStream.of(50, 70, 11, 2233, 1020, 234);
		LongStream st2, st3, st4, st5;
		
		//print each value
		st.forEach(System.out::println);

		//create new stream in range
		st2 = LongStream.range(1000000, 2000000);

		//display count
		System.out.println("Count: " + st2.count());

		//create new stream in range
		st3 = LongStream.rangeClosed(100, 125);

		//display its average value as a double
		System.out.println("Sum: " + st3.sum());
	
		//create a new stream in range
		st4 = LongStream.rangeClosed(100, 150);
		long[] arr = st4.toArray();

		//print out numbers divisible by both 3 and 5
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0 && arr[i] % 5 == 0)
				System.out.print(arr[i] + " ");
		}

		
		//create new stream and print distinct values
		st5 = LongStream.of(1,1,1,2,6,5,5,6,23,4,5,3,1,1,3);
		st5.distinct().forEach(System.out::println);
	} //main
} //class
