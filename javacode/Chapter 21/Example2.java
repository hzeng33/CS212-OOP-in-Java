/**
 * Example2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 21
 * http://www.cstutoringcenter.com
 */
import java.time.Year;
public class Example2{
	   public static void main(String args[]){
		   Year year1 = Year.now(); //current year
		   Year year2 = Year.of(2012); //year 2012

		   //print years
		   System.out.println(year1);
		   System.out.println(year2);
		   
		   //check for leap years
		   System.out.println(year1.isLeap());
		   System.out.println(year2.isLeap());
		   
		   //do they match?
		   System.out.println(year1.equals(year2));

		   //is year1 after year2?
		   System.out.println(year1.isAfter(year2));
		   
		   //is year2 before year1?
		   System.out.println(year2.isBefore(year1));
		   
		   //add some years
		   System.out.println(year1.plusYears(10));
		   System.out.println(year2.plusYears(2));

		   //print years again
		   System.out.println(year1);
		   System.out.println(year2);

		   //define new year
		   Year year3;
		   year3 = year1.minusYears(4);
		   
		   //print length of the year
		   System.out.println(year1.length());
		   System.out.println(year2.length());
		   System.out.println(year3.length());
		   
		   //print final results
		   System.out.println(year1.getValue());
		   System.out.println(year2.getValue());
		   System.out.println(year3.getValue());		   
	   } //main
} //class
