/**
 * Example8.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Example8{	
	public static void main(String args[]){
		Compass c = Compass.WEST;
		
		if(c == Compass.NORTH){
            System.out.println("Heading North");
      }else if(c == Compass.SOUTH){
            System.out.println("Heading South");
      }else if(c == Compass.EAST){
            System.out.println("Heading East");
      }else{
            System.out.println("Heading West");
      }

	//change direction
      c = Compass.SOUTH;

      switch(c){
	case NORTH:
		System.out.println("Now Heading North");
		break;
      
	case SOUTH:
		System.out.println("Now Heading South");
		break;

	case EAST:
		System.out.println("Now Heading East");
		break;

	case WEST:
		System.out.println("Now Heading West");
		break;
      }
	} //main
} //class
