/**
 * MainRect.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 13
 * http://www.cstutoringcenter.com
 */
public class MainRect{
	public static void main(String args[]){
		Rect r1, r2;

		//define Rect objects		
		r1 = new Rect();
		r2 = new Rect(5.0,3.0);
		
		//use get methods
		System.out.println(r1.getLength() + " " + r1.getWidth());
		System.out.println(r2.getLength() + " " + r2.getWidth());
		
		//find areas
		System.out.println("Area of r1 is: " + r1.Area());
		System.out.println("Area of r2 is: " + r2.Area());
		
		//make a change in r1
		r1.setLength(4.0);
		r1.setWidth(2.0);
		
		//display the perimeters of each
		System.out.println("Perimeter of r1 is: " 
 	           + r1.Perimeter());		
                System.out.println("Perimeter of r2 is: " 
                  + r2.Perimeter());
	} //main
} //class