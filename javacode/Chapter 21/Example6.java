/**
 * Example6.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 21
 * http://www.cstutoringcenter.com
 */
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Example6{
	   public static void main(String args[]){
		   DayOfWeek day = DayOfWeek.FRIDAY;
		   LocalDate date = LocalDate.parse("2019-02-01");
		   
		   System.out.println(day.getValue());
		   System.out.println(day.plus(55));
		   System.out.println(day.minus(55));
		   
		   day = day.from(date.plusDays(2));
		   System.out.println(day.getValue());
		   System.out.println(day);
	   } //main
} //class
