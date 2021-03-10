/**
 * Animal.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class Animal{
	//instance variables
	private String name;
	private int age;

	//two argument constructor for name and age	
	public Animal(String n, int a){
		name = n;
		age = a;
	}

	//get methods
	public String getName() { return name; }
	public int getAge() { return age; }
} //Animal
