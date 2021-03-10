/**
 * Example5.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 21
 * http://www.cstutoringcenter.com
 */
import java.time.LocalDateTime;
import java.time.Month;
public class Example5{
	   public static void main(String args[]){
		   //declare LocalDateTime objects
		   LocalDateTime dt1 = LocalDateTime.of(
                 2019, Month.MARCH, 17, 10, 15, 20);
		   LocalDateTime dt2 = LocalDateTime.parse(
                       "2015-07-04T11:11:11");

		   //print current values
		   System.out.println(dt1);
		   System.out.println(dt2);

		   //extract LocalDate
		   System.out.println(dt1.toLocalDate());
		   System.out.println(dt2.toLocalDate());

		   //extract LocalTime
		   System.out.println(dt1.toLocalTime());
		   System.out.println(dt2.toLocalTime());

		   //check if dates are before each other
		   System.out.println(dt1.isBefore(dt2));
		   System.out.println(dt2.isBefore(dt1));

		   //print out day of the week for each LocalDateTime
		   System.out.println(dt1.getDayOfWeek());
		   System.out.println(dt2.getDayOfWeek());

		   //extract specific values of each LocalDateTime
		   int h1, h2, m1, m2, s1, s2, n1, n2;
		   h1 = dt1.getHour();
		   h2 = dt2.getHour();
		   m1 = dt1.getMinute();
		   m2 = dt2.getMinute();
		   s1 = dt1.getSecond();
		   s2 = dt2.getSecond();
		   n1 = dt1.getNano();
		   n2 = dt2.getNano();
		   
		   System.out.println(h1-h2);
		   System.out.println(m1+m2);
		   System.out.println(s1-s2);
		   System.out.println(n1+n2);

		   //declare new LocalDateTime and print
		   LocalDateTime dt3 = LocalDateTime.of(
                   dt1.minusYears(4).getYear(), 
		       dt1.minusMonths(1).getMonth(), 
                   dt1.plusDays(19).getDayOfMonth(), 1, 2, 3);

		   System.out.println(dt3.toString());
	   } //main
} //class
