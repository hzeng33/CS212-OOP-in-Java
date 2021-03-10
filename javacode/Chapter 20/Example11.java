/**
 * Example11.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
public class Example11{
	public static void main(String args[]) {
		DoubleStream st = 
           DoubleStream.of(1.1, 3.3, 2.2, 6.6, 7.7, 5.5, 4.4);

		DoubleStream st2, st3, st4, st5;

		//sort stream and print each value		
		st.sorted().forEach(System.out::println);
		
		//create new stream and print minimum value as a double
		st2 = DoubleStream.of(7, 6, 5, 4, 3, 2, 1.1);

		System.out.println("Min: " + st2.min().getAsDouble());

		//create new stream and print its count
		st3 = DoubleStream.of(5.5555);

		System.out.println("Count: " + st3.count());

		//create a new stream and print value if its present
		st4 = DoubleStream.of(999.999, 777.777, 444.444, 888.888);

		OptionalDouble opt = st4.findAny();
		
		if(opt.isPresent()) {
			System.out.println(opt.getAsDouble());
		}else {
			System.out.println("654321");
		}

		//create new stream and print its distinct values
		st5 = DoubleStream.of(1, 3, 1, 1, 5, 5, 3, 4, 5, 2, 9);
		System.out.println("Distinct: ");

		st5.distinct().forEach(System.out::println);
	} //main
} //class
