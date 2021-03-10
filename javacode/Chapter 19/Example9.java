/**
 * Example9.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example9{	
	public static void main(String args[]){
		Compass c = Compass.WEST;

		System.out.println("We are heading " + c.getDirection());

	//change direction
      c = Compass.SOUTH;

		System.out.println("We are now heading " 
            + c.getDirection());      
	} //main
} //class
