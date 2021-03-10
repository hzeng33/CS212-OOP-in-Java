/**
 * Lion.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Lion extends Animal {
	Lion(String n){
		super(n);
	}
	
	//implemented sounds() method	
	public String sounds() {
		return "roars!";
	}	

	//overloaded toString() method
	public String toString() {
		return super.toString();
	}
}
