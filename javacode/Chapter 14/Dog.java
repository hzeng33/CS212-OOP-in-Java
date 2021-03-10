/**
 * Dog.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class Dog extends Animal{
	//two argument constructor for name and age
	public Dog(String n, int a){
		super(n, a);
	}
	//a dog goes woof!
	private String sound() { return "Woof!"; }

	//overloaded toString method	
	public String toString() { return "My name is " 
       + super.getName() + " I am a " 
       + this.getClass().getName() + " and I " + sound();
	}
} //Dog
