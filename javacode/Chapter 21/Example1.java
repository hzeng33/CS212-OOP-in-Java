/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 21
 * http://www.cstutoringcenter.com
 */
import java.time.Month;
public class Example1{
	   public static void main(String args[]){
		   Month month1 = Month.of(5);
		   Month month2 = Month.FEBRUARY;
		   
		   //print current months
		   System.out.println(month1);
		   System.out.println(month2);

		   //get int value, representing current months
		   System.out.println(month1.getValue());
		   System.out.println(month2.getValue());

		   //subtract months from current Month objects
		   System.out.println(month1.minus(4));
		   System.out.println(month2.minus(44));

		   //add months from current Month objects
		   System.out.println(month1.plus(4));
		   System.out.println(month2.plus(44));

		   //determine which months are the first of a quarter
		   System.out.println(month1.firstMonthOfQuarter());
		   System.out.println(month2.firstDayOfYear(false));

		   //determine the number of days in a given month
		   System.out.println(month1.length(false));
		   System.out.println(month2.length(true));
	   } //main
} //class
