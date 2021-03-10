/**
 * Rectangle.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Rectangle extends Shape{
	//sides need to at least be positive so make default of 0.01
	private double length = 0.01, width = 0.01;
	
	//default constructor setting the length & width equal to 1.0
	public Rectangle(){
		length = width = 1.0;
	}

	//constructor to set the length & width equal to the
	//arguments. Checks for a negative or 0 value for either.
	public Rectangle(double l, double w) {
		if(l <= 0.0 || w <= 0.0) {
			return;
		}
		length = l;
		width = w;
	}

	//get/set methods
	public double getLength() { return length; }
	public double getWidth() { return width; }

	public void setLength(double len) { length = len; }
	public void setWidth(double w) { width = w; }

	//abstract method written in Rectangle class
	//area of a rectangle is its length * width
	public double area() { 
		return length * width; 
	}

	//abstract method written in Rectangle class
	//perimeter of a rectangle is 2*length + 2*width
	public double perimeter() { 
		return 2.0*length + 2.0*width;
	}

	//overloaded toString() which returns the name
	//of the class
	public String toString() {
		return getClass().getName();
	}
} //Rectangle
