/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 21
 * http://www.cstutoringcenter.com
 */
import java.time.LocalTime;
public class Example4{
	   public static void main(String args[]){
		   LocalTime time1 = LocalTime.of(13, 2, 30);
		   LocalTime time2 = LocalTime.of(3, 12, 27);
		   
		   //print the LocalTime objects
		   System.out.println(time1);
		   System.out.println(time2);

		   //print some info from each LocalTime		   
		   System.out.println(time1.getHour());
		   System.out.println(time1.getMinute() 
                   - time2.getMinute());
		   
		   //check if times are after each other
		   System.out.println(time1.isAfter(time2));
		   System.out.println(time2.isAfter(time1));

		   //convert the current times over the length of the day
		   System.out.println(time1.toSecondOfDay());
		   System.out.println(time2.toNanoOfDay());

		   //create new LocalTime object
		   LocalTime time3 = time1.withHour(3);

		   System.out.println(time3.getHour() - time1.getHour());
	   } //main
} //class
