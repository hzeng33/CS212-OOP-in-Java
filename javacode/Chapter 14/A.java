/**
 * A.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class A{
	//instance variables
	private int n1, n2;

	//default constructor setting variables to 0
	A(){
		n1 = n2 = 0;
	}

	//two argument constructor
	A(int n, int m){
		n1 = n;
		n2 = m;
	}

	//get methods
	public int getN1() { return n1; }
	public int getN2() { return n2; }

	//set methods
	public void setN1(int n1) { this.n1 = n1; }
	public void setN2(int n2) { this.n2 = n2; }

	//member method
	public int mysteryA() {
		return n1 * n2;
	}
} //A class
