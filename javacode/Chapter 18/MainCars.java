/**
 * MainCars.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 18
 * http://www.cstutoringcenter.com
 */
public class MainCars{
	public static void main(String args[]){
		Car cars[] = new Car[5];
		
		cars[0] = new Car("Ford Taurus", 3);
		cars[1] = new Car("Mazda Tribute", 2);
		cars[2] = new Car("Toyota Camary");
		cars[3] = new Car("Honda Accord", 2);
		cars[4] = new Car("Ford Tundra");
	
		for(int i = 0; i < 5; i++){
			cars[i].start();
		}	
	} //main
} //class
