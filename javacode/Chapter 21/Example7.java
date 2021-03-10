/**
 * Example7.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 21
 * http://www.cstutoringcenter.com
 */
import java.time.Period;
import java.time.LocalDate;
public class Example7{
	   public static void main(String args[]){
		   //declare LocalDate objects and Period object
		   LocalDate date = LocalDate.of(2018, 9, 10); //2019-09-10
		   LocalDate date2 = LocalDate.of(1902, 4, 8); //1902-04-08 
		   Period p;

		   //print out LocalDate objects
		   System.out.println(date);
		   System.out.println(date2);
		   
		   //length of time starting at date and ending with date2
		   p = Period.between(date, date2);
		   System.out.println(p);

		   //length of time starting at date2 and ending with date
		   p = Period.between(date2, date);
		   System.out.println(p);

		   //set number of years in the Period and print
		   p = Period.ofYears(20000);
		   System.out.println(p);

		   p = Period.of(5, 18, 5); //5 years, 18 months, 5 days
		   System.out.println(p.isNegative());
		   System.out.println(p.isZero());

		   //normalize the length of the period from above
		   p = p.normalized();
		   System.out.println(p);
		   System.out.println(p.negated());

		   //print the LocalDates modified by Period length above
		   System.out.println(date.minus(p));
		   System.out.println(date2.minus(p));
	   } //main
} //class
