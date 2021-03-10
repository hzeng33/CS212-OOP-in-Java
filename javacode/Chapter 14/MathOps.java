/**
 * MathOps.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class MathOps{
	//instance variables for the two numbers
	private double n1, n2;

	//two argument constructor, taking the respective values
	//for the two numbers
	MathOps(double n1, double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	//set methods
	public void setN1(double n1) { this.n1 = n1; }
	public void setN2(double n2) { this.n2 = n2; }
	
	//member methods
	private double sum() { return n1+n2; }
	private double product() { return n1*n2; }
	private double diff() { return n1-n2; }
	private double div() { return n1/n2; }

	//I wonder what happens
	public double mystery() {
		return sum() + product();
	}

	//The mystery deepens
	public double mystery2() {
		return div() - diff();
	}
} //MathOps
