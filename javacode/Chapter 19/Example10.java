/**
 * Example10.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example10{	
	public static void main(String args[]){
		for(TrafficLight tl : TrafficLight.values()){
			System.out.println("Light is currently " + tl);
			System.out.println("It will last for: " 
                  + tl.getSecondsAtColor());
			System.out.println("Next color is: " 
                  + tl.nextSignal());
      }
	} //main
} //class
