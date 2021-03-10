/**
 * Example1.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class Example1{
	public static void main(String args[]){
		Dog d = new Dog("Ralph", 5);
		Cat c = new Cat("Fluffy", 10);

		//print current d and c objects
		System.out.println(d);
		System.out.println(c);
		
		//make a new instance of each
		d = new Dog("Butch", 4);
		c = new Cat("Max", 3);

		//print current d and c objects		
		System.out.println(d);
		System.out.println(c);
	} //main
} //class
