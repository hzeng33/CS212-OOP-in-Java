/**
 * Circle.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Circle extends Shape{
	private double radius = 0.01;
	private final double PI = Math.PI;
	
	//default constructor
	public Circle(){
		radius = 1.0;
	}

	//constructor to set the radius equal to the
	//argument. Checks for a negative or 0 value
	public Circle(double r) {
		if(r <= 0) {
			return;
		}
		radius = r;
	}
	
	//get/set methods
	public double getRadius() { return radius; }
	public void setRadius(double r) { radius = r; }

	//abstract method written in Circle class
	//area of a circle is PI * radius^2
	public double area() { 
		return PI * radius * radius;
	}

	//abstract method written in Circle class
	//perimeter of a circle is 2*PI*radius
	//also called circumference
	public double perimeter() { 
		return 2.0*PI*radius;
	}	
	
	//overloaded toString() which returns the name
	//of the class
	public String toString() {
		return getClass().getName();
	}
} //Circle
