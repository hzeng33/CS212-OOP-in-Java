/**
 * Example4.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 15
 * http://www.cstutoringcenter.com
 */
public class Example4{
	   public static void main(String args[]){
		   //Scanner and variables
		   Scanner s = new Scanner(System.in);
		   int m = 0, d = 0, y = 0;		   
		   try {
			   //prompt user for name entry
			   System.out.println("Enter month (1-12): ");
			   m = s.nextInt();

			   //prompt user for name entry
			   System.out.println("Enter day (1-31): ");
			   d = s.nextInt();

			   //prompt user for name entry
			   System.out.println("Enter year (1900-2019): ");
			   y = s.nextInt();
	
		  	   //try to build new DateEntry object
			   DateEntry date = new DateEntry(m, d, y);
			   
			   System.out.println(date);		   
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	   } //main
} //class
