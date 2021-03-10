/**
 * Square.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 17
 * http://www.cstutoringcenter.com
 */
public class Square extends Shape{
	//all 4 sides are equal in a Square
	//sides need to at least be positive so make default of 0.01
	private double sides = 0.01;
	
	//default constructor setting the sides equal to 1.0
	public Square(){
		sides = 1.0;
	}

	//constructor to set the sides equal to the
	//argument. Checks for a negative or 0 value
	public Square(double s) {
		if(s <= 0.0) {
			return;
		}
		sides = s;
	}

	//get/set methods
	public double getSides() { return sides; }
	public void setSides(double s) { sides = s; }

	//abstract method written in Square class
	//area of a square is it's side^2
	public double area() { 
		return sides * sides; 
	}

	//abstract method written in Square class
	//perimeter of a square is 4*sides
	public double perimeter() { 
		return 4.0 * sides; 
	}
	
	//overloaded toString() which returns the name
	//of the class
	public String toString() {
		return getClass().getName();
	}
} //Square
