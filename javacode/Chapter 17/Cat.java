/**
 * Cat.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Cat extends Animal {
	Cat(String n){
		super(n);
	}

	//implemented sounds() method		
	public String sounds() {
		return "meows!";
	}

	//overloaded toString() method
	public String toString() {
		return super.toString();
	}
}
