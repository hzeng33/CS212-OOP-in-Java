/**
 * C.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class C extends B{
	//default constructor. Super constructor is B()
	C(){  super(); }

	//two argument constructor. Super constructor is B(n, m)
	C(int n, int m) { 
       super(n, m); 
}	

	//member method
	public int mysteryC() {
		return getN2() + mysteryB();
	}
} //C class
