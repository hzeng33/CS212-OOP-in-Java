/**
 * Rect.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 13
 * http://www.cstutoringcenter.com
 */
public class Rect{
	private double length, width;

	//default constructor setting length & width equal to 1.0
	public Rect(){
		length = width = 1.0;
	}
	//2 argument constructor
	public Rect(double a, double b){
		length = a; 
		width = b;
	}

	//get methods:
	public double getLength(){ return length; }
	public double getWidth(){ return width; }

	//set methods:
	public void setLength(double len){
		if(len <= 0.0)
			return;

		length = len;
	}
	public void setWidth(double w){
		if(w <= 0.0)
			return;

		width = w;
	}

	//method to find the area of the rectangle
	public double Area(){
		return(length*width);
	}

	//method to find the perimeter of the rectangle
	public double Perimeter(){
		return(2.0*length + 2.0*width);
	}
} //class
