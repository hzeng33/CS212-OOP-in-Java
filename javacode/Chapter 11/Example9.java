/**
 * Example9.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 11
 * http://www.cstutoringcenter.com
 */
public class Example9{
	public static void main(String args[]){
		//variables
		double angle1 = 45, angle2 = 90, angle3 = 180;
		
		//convert the above to radians
		angle1 = Math.toRadians(angle1);
		angle2 = Math.toRadians(angle2);
		angle3 = Math.toRadians(angle3);
		
		//show the various Math trigonometry methods
		System.out.println("Sin of angle1: " + Math.sin(angle1));
		System.out.println("Sin of angle2: " + Math.sin(angle2));
		System.out.println("Sin of angle3: " + Math.sin(angle3));

		System.out.println("Cos of angle1: " + Math.cos(angle1));
		System.out.println("Cos of angle2: " + Math.cos(angle2));
		System.out.println("Cos of angle3: " + Math.cos(angle3));

		System.out.println("Tan of angle1: " + Math.tan(angle1));
		System.out.println("Tan of angle2: " + Math.tan(angle2));
		System.out.println("Tan of angle3: " + Math.tan(angle3));
	} //main
} //class
