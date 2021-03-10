/**
 * B.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 14
 * http://www.cstutoringcenter.com
 */
public class B extends A{
	//default constructor. Super constructor is A()
	B(){ super(); }

	//two argument constructor. Super constructor is A(n, m)
	B(int n, int m) { 
      super(n, m); 
}
	//member method
	public int mysteryB() {
		return getN1() + mysteryA();
	}
} //B class
