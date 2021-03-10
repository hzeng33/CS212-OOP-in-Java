/**
 * Cat.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class Cat extends Animal{
	//two argument constructor for name and age
	public Cat(String n, int a){
		super(n, a);
	}
	//a cat meows!
	private String sound() { return "Meow!"; }

	//overloaded toString method	
	public String toString() { return "My name is " 
       + super.getName() + " I am a " 
       + this.getClass().getName() + " and I " + sound();
	}
} //Cat
