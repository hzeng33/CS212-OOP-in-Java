/**
 * Example3.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 21
 * http://www.cstutoringcenter.com
 */
import java.time.LocalDate;
public class Example3{
	   public static void main(String args[]){
		   LocalDate date = LocalDate.parse("2019-04-02");
		   LocalDate date2 = LocalDate.of(2012, 2, 5);

		   //print out both dates
		   System.out.println(date);
		   System.out.println(date2);
		   
		   int month, day, year;
		   month = date.getMonthValue();
		   day = date.getDayOfMonth();
		   year = date.getYear();

		   //print date1 in another format
		   System.out.println(month + "/" + day + "/" + year);

		   //print info about date2
		   System.out.println(date2.isLeapYear());
		   System.out.println(date2.lengthOfMonth());
		   System.out.println(date2.lengthOfYear());

		   //print info about date with time adjustments
		   System.out.println(date.minusWeeks(26));
		   System.out.println(date.plusWeeks(26));

		   //print info about date2 with time adjustments
		   System.out.println(date2.minusDays(40));
		   System.out.println(date2.plusDays(40));

		   //create a new LocalDate
		   LocalDate date3 = date2.withMonth(6);

		   //print date3
		   System.out.println(date3);
	   } //main
} //class
