/**
 * Dog.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Dog extends Animal{
	Dog(String n){
		super(n);
	}

	//implemented sounds() method	
	public String sounds() {
		return "barks!";
	}

	//overloaded toString() method
	public String toString() {
		return super.toString();
	}
}
