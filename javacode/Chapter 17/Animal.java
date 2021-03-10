/**
 * Animal.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Animal implements Sounds{
	private String name = "";
	Animal(String n){
		name = n;
	}

	//implemented sounds() method
	public String sounds() {
		return "makes no sounds!";
	}

	//overloaded toString() method
	public String toString() {
		return "My name is " + name 
		+ " and I am a " + getClass().getName() 
		+ " who " + sounds();
	}
}
